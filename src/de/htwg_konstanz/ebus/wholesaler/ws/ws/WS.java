package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import javax.jws.WebService;

import de.htwg_konstanz.ebus.wholesaler.ws.client.ListOfModifiedProductsT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.SupplierProductT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateCatalogPort;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateRequestT;
import de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateResponseT;


@WebService(endpointInterface="de.htwg_konstanz.ebus.wholesaler.ws.client.UpdateCatalogPort", targetNamespace="http://new.webservice.namespace")
public class WS implements UpdateCatalogPort {
	
		@Override
		public UpdateResponseT updateCatalog(UpdateRequestT body) {
			String wholesalerName= body.getAuthentication().getWholesalerName();
			UpdateResponseT response = new UpdateResponseT();
			ListOfModifiedProductsT list = new ListOfModifiedProductsT();
			SupplierProductT spt = new SupplierProductT();
			spt.setShortDescription(wholesalerName);
			list.getSupplierProduct().add(spt);
			response.setListOfModifiedProducts(list);
			
			return response;
		}

}


