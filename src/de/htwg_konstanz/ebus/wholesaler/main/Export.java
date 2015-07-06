package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import javax.xml.validation.SchemaFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.PriceBOA;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;

public class Export {

	//convert to BMECAT or XHTML method
	public void doExport(final String viewAction, final HttpServletResponse response,
			final List<BOProduct> products)	throws ParserConfigurationException, IOException, TransformerException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		OutputStream out = response.getOutputStream();
		
		StreamResult result = new StreamResult(out);
		document = convertToBME(document, products);
		validate(document);
		
		if (viewAction.contentEquals("XHTML")) {
			transformToXHTML(document, response);
			return;
		}
		
		Source source = new DOMSource(document);
		// write dom to output stream
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(source, result);
		out.close();
	}

	private Document convertToBME(Document document, final List<BOProduct> products) {
		// create root element and prolog
		Element root = document.createElement("BMECAT");
		root.setAttribute("version", "1.2");
		root.setAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");

		// create elements
		Element header = document.createElement("HEADER");
		Element catalog = document.createElement("CATALOG");
		Element supplier = document.createElement("SUPPLIER");
		Element language = document.createElement("LANGUAGE");
		Element catalogId = document.createElement("CATALOG_ID");
		Element catalogVersion = document.createElement("CATALOG_VERSION");
		Element catalogName = document.createElement("CATALOG_NAME");
		Element supplierName = document.createElement("SUPPLIER_NAME");
		Element tNewCatalog = document.createElement("T_NEW_CATALOG");
		// create text
		language.appendChild(document.createTextNode("deu"));
		catalogId.appendChild(document.createTextNode("EBUS-15"));
		catalogVersion.appendChild(document.createTextNode("1.0"));
		catalogName.appendChild(document.createTextNode("Beispielproduktkatalog fuer E-Business Laborpraktika"));
		supplierName.appendChild(document.createTextNode("HTWG Konstanz"));
		// append elements
		document.appendChild(root);
		root.appendChild(header);
		header.appendChild(catalog);
		header.appendChild(supplier);
		catalog.appendChild(language);
		catalog.appendChild(catalogId);
		catalog.appendChild(catalogVersion);
		catalog.appendChild(catalogName);
		supplier.appendChild(supplierName);
		root.appendChild(tNewCatalog);

		// add products to catalog
		for (BOProduct product : products) {
			Element article = document.createElement("ARTICLE");
			Element articleDetails = document.createElement("ARTICLE_DETAILS");
			Element articleOrderDetails = document
					.createElement("ARTICLE_ORDER_DETAILS");
			if (product.getOrderNumberCustomer() != null) {
				Element supplierAid = document.createElement("SUPPLIER_AID");
				supplierAid.appendChild(document.createTextNode(product
						.getOrderNumberCustomer()));
				article.appendChild(supplierAid);
			}
			article.appendChild(articleDetails);
			article.appendChild(articleOrderDetails);
			if (null != product.getShortDescription()) {
				Element descriptionShort = document
						.createElement("DESCRIPTION_SHORT");
				descriptionShort.appendChild(document.createTextNode(product.getShortDescription()));
				articleDetails.appendChild(descriptionShort);
			}
			if (null != product.getLongDescription()) {
				Element descriptionLong = document
						.createElement("DESCRIPTION_LONG");
				descriptionLong.appendChild(document.createTextNode(product.getLongDescription()));
				articleDetails.appendChild(descriptionLong);
			}

			Element ean = document.createElement("EAN");
			if (product.getOrderNumberCustomer().length() > 14) {
				String s = product.getOrderNumberCustomer().trim()
						.substring(0, 14);
				ean.appendChild(document.createTextNode(s));
			} else {
				ean.appendChild(document.createTextNode(product
						.getOrderNumberCustomer()));
			}
			articleDetails.appendChild(ean);

			Element orderUnit = document.createElement("ORDER_UNIT");
			Element noCuPerOu = document.createElement("NO_CU_PER_OU");
			orderUnit.appendChild(document.createTextNode("C62"));
			noCuPerOu.appendChild(document.createTextNode("10"));
			articleOrderDetails.appendChild(orderUnit);
			articleOrderDetails.appendChild(noCuPerOu);

			tNewCatalog.appendChild(article);

			// Price Details
			List<BOSalesPrice> salesPrices = PriceBOA.getInstance()
					.findSalesPrices(product);
			Element priceDetails = document
					.createElement("ARTICLE_PRICE_DETAILS");

			for (BOSalesPrice salesPrice : salesPrices) {

				// Create Price elements
				Element articlePrice = document.createElement("ARTICLE_PRICE");
				Element priceAmount = document.createElement("PRICE_AMOUNT");
				Element currency = document.createElement("PRICE_CURRENCY");
				Element tax = document.createElement("TAX");
				Element priceTerritory = document.createElement("TERRITORY");

				// Add the elements to the article prcie
				articlePrice.appendChild(priceAmount);
				articlePrice.appendChild(currency);
				articlePrice.appendChild(tax);
				articlePrice.appendChild(priceTerritory);

				// set the Price Type
				articlePrice.setAttribute("price_type",
						salesPrice.getPricetype());

				// Set the values of the elements
				priceAmount.appendChild(document.createTextNode(salesPrice
						.getAmount().toString()));
				currency.appendChild(document.createTextNode(salesPrice
						.getCountry().getCurrency().getCode()));
				tax.appendChild(document.createTextNode(salesPrice.getTaxrate()
						.toString()));
				priceTerritory.appendChild(document.createTextNode(salesPrice
						.getCountry().getIsocode()));

				// add Price to the element Price details
				priceDetails.appendChild(articlePrice);

			}
			// add all Prices to the Article
			article.appendChild(priceDetails);
			// add the article to the catalog
			tNewCatalog.appendChild(article);
		}

		return document;
	}


	private void validate(Document xmlDOM) {
		//parser for schema
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
		URL schemaURL;
		try {
			schemaURL = new File("C:\\Svetik\\EBUT\\WholesalerWebDemo\\files\\bmecat_new_catalog_1_2_simple_without_NS.xsd").toURI().toURL();
			Schema schema = sf.newSchema(schemaURL); 
			Validator validator = schema.newValidator();
			DOMSource source = new DOMSource(xmlDOM);
			validator.validate(source);
			System.out.println("Document is valid");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("The Uploaded XML File is not valid!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error while reading DOM");
			e.printStackTrace();
		}
	}


	private OutputStream transformToXHTML(Document doc,	HttpServletResponse response) {
		try {
			//get streams and prepare output
			OutputStream output = response.getOutputStream();
			Result result = new StreamResult(output);
			InputStream input = new FileInputStream("C:\\Svetik\\EBUT\\WholesalerWebDemo\\files\\TransformationToXhtml.xsl");
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			Source xmlSource = new DOMSource(doc);
			Result outputTarget = new StreamResult(outputStream);
			//transform BMECAT to xhtml preparation
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer;
			transformer = factory.newTransformer();
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer = factory.newTransformer(new StreamSource(input));
			TransformerFactory.newInstance().newTransformer().transform(xmlSource, outputTarget);
			InputStream is = new ByteArrayInputStream(outputStream.toByteArray());
			//settings for transformation
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"yes");
			//transform
			transformer.transform(new StreamSource(is), result);

			output.close();

			return output;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
