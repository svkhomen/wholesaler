package de.htwg_konstanz.ebus.wholesaler.main;

import java.util.ArrayList;

import javax.xml.ws.WebServiceRef;

import de.htwg_konstanz.ebus.wholesaler.ws.client.AuthenticationT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.ListOfProductsT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.ObjectFactory;
import de.htwg_konstanz.ebus.wholesaler.ws.client.SupplierProductT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateCatalogFault;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateCatalogPort;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateProductWebService;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateRequestT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateResponseT;

public class Client {
	
	public ArrayList<String> errorList;
	@WebServiceRef(wsdlLocation="http://localhost:8080/WholesalerWebDemo/UpdateCatalog?wsdl")
	UpdateProductWebService client;
	
	ObjectFactory factory = new ObjectFactory();
	
	public Client(ArrayList<String> erroList){
		this.errorList = erroList;
	}
	
	public void startClient(){
		
		UpdateResponseT response = factory.createUpdateResponseT();
		client = new UpdateProductWebService();
		
		UpdateCatalogPort port =  client.getUpdateProductSOAP();
		AuthenticationT auth = new AuthenticationT();
		auth.setWholesalerName("Wholesaler");
		auth.setWsPassword("password");
		auth.setWsUsername("user");
		
		UpdateRequestT request = new UpdateRequestT();
		ListOfProductsT list = new ListOfProductsT();
		SupplierProductT spt = new SupplierProductT();
		spt.setShortDescription("TEST");
		list.getSupplierProduct().add(spt);
		request.setListOfProducts(list);
		request.setAuthentication(auth);
		
		try {
			response = port.updateCatalog(request);
			for(SupplierProductT sp : response.getListOfModifiedProducts().getSupplierProduct()){
				errorList.add(sp.getShortDescription());
			}
		} catch (UpdateCatalogFault e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
