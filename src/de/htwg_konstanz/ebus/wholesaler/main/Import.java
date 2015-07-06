package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.apache.commons.io.FilenameUtils;

import java.io.File;


import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.*;


import org.w3c.dom.NodeList;


import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.SupplierBOA;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;



public class Import {
	
	/*
	  import xml into db
	 */
	
	public void uploadXML(HttpServletRequest request, ArrayList<String> errorList) {
		


		InputStream uploadFile = getFile(request, errorList);
		if(uploadFile == null){
			return;
		}
		Document document = createDOM(uploadFile, errorList);
		if(document != null){
			if(validate(document, errorList)){
				BOSupplier supplier = checkSupplier(document, errorList);
				if(supplier != null){
					DB db = new DB();
					db.insertProductsIntoDB(document, errorList, supplier);
				} else {
					System.out.println("Supplier not found");
				}
			} else {
				System.out.println("Document not valid!");
			}
		}
	}
	
	/*
	  uploads file and gets input stream from the file
	  @param request HttpServletRequest
	  @param errorList user notification
	  @return inputStream from upload
	 */
	private InputStream getFile(HttpServletRequest request, ArrayList<String> errorList) {
		//Factory and Servlet for FileUpload
		System.out.println("Upload File");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		InputStream uploadFile = null;
		try {
			List<FileItem> items = upload.parseRequest(request);
			uploadFile = items.get(0).getInputStream();
			for(FileItem item : items){
				if(!item.isFormField()){
					String filename = FilenameUtils.getName(item.getName());
					String fileExtension = FilenameUtils.getExtension(item.getName());
					System.out.println("File: " + filename);
					if(!filename.endsWith(".xml")){
						errorList.add("Uploaded File is from Type '." + fileExtension + "'. Only XML Files are accepted");
						uploadFile=null;
					}
				}
			}
		} catch (FileUploadException e) {
			errorList.add("Error while uploading file!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Could not read input!");
			e.printStackTrace();
		}
		return uploadFile;
	}
	
	/*
	  Create DOM from InputStream
	  @param inputStream the uploaded imputStream
	  @param errorList user notification
	  @return the BMECAT document or an error.
	 */
	private Document createDOM(InputStream uploadFile, ArrayList<String> errorList) {
		System.out.println("Create DOM from InputStream.....");
		Document document = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setIgnoringElementContentWhitespace(true);
		try {
			System.out.println("try DOM");
			DocumentBuilder parser = dbf.newDocumentBuilder();
			document = parser.parse(uploadFile);
			System.out.println("DOM created");
		} catch (ParserConfigurationException e) {
			errorList.add("Error during parser configuration!");
			e.printStackTrace();
		} catch (SAXException e) {
			errorList.add("Error! Parsed xml isn't wellformed!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error during parsing!");
			e.printStackTrace();
		}
		return document;

	}
	
	/*
	  validates DOM according to scheme bmecat xsd

	  @return if valid - true, if not -  false
	 */
	
	public boolean validate(Document document, ArrayList<String> errorList) {
		boolean isValid = false;
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Validator validator = null;
		Schema bmecat = null;
		try {
			bmecat = schemaFactory.newSchema(new File("C:\\Svetik\\EBUT\\WholesalerWebDemo\\files\\bmecat_new_catalog_1_2_simple_without_NS.xsd"));
			validator = bmecat.newValidator();
			//Validate DOM
			validator.validate(new DOMSource(document)); //if the validation fails an exception is thrown
			isValid = true;
		} catch (SAXException e) {
			errorList.add("The Uploaded XML File is not valid!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error while reading DOM");
			e.printStackTrace();
		} 		
		return isValid;
	}
	
	/*
	 checks if supplier exists
	 @param document the DOM
	 @param errorList user notification
	 @return corresponding supplier from db, if not found -> null
	 */
	private BOSupplier checkSupplier(Document document, ArrayList<String> errorList) {
		//get suppliers in document
		NodeList suppliers = document.getElementsByTagName("SUPPLIER_NAME");
		

		if(suppliers.getLength() == 0){
			System.out.println("No Supplier in uploaded Document");
		} else {
			//search for found supplier in db
			List<BOSupplier> supplierList = SupplierBOA.getInstance().findByCompanyName(suppliers.item(0).getChildNodes().item(0).getNodeValue());
						
			if(supplierList.isEmpty()){
				errorList.add("Supplier " + suppliers.item(0).getChildNodes().item(0).getNodeValue() +" not found in DB!");
			} else {
				return supplierList.get(0);
			}			
		}		
		return null;
	}
	
}
