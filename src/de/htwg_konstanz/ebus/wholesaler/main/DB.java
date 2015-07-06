package de.htwg_konstanz.ebus.wholesaler.main;

import java.math.BigDecimal;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCountry;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOPurchasePrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.PriceBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.vo.Country;


public class DB {
	
	/*
	  makes the operations with the DB:
	  inserts products
	  @param document the BMECAT document
	  @param errorList for User notification
	  @param supplier the supplier of the product
	  @return product which has been inserted
	 */
	public BOProduct insertProductsIntoDB(Document document, List<String> errorList, BOSupplier supplier){
		System.out.println("insert Products Into DB.......");
		//Get all articles from the uploaded catalog by tagname
		NodeList articleList = document.getElementsByTagName("ARTICLE");
		BOProduct product = null;
		int countAdded = 0;
		int countUpdated = 0;
		
		//Iterate over every "ARTICLE" in catalog 
		for(int i = 0; i < articleList.getLength(); i++){
			product = new BOProduct();   //create new product
			Element article = (Element)articleList.item(i);

			//get "SUPPLIER_AID" (Artikelnummer) and set the value for product
			NodeList supplier_aid = article.getElementsByTagName("SUPPLIER_AID");
			
			//supplier_aid has been changed in order to differ between supplierOrderNumber and customerOrderNumber
			product.setOrderNumberSupplier("son" + supplier.getSupplierNumber() + supplier_aid.item(0).getChildNodes().item(0).getNodeValue()); 
			product.setOrderNumberCustomer("con" + supplier.getSupplierNumber() + supplier_aid.item(0).getChildNodes().item(0).getNodeValue());
	
			product.setSupplier(supplier);
			System.out.println("OrderNumberSupplier " + product.getOrderNumberSupplier());
			
			//get "DESCRIPTION_SHORT" and set the value for product
			NodeList description_short = article.getElementsByTagName("DESCRIPTION_SHORT"); 
			product.setShortDescription(description_short.item(0).getChildNodes().item(0).getNodeValue());
			System.out.println("description_short " + product.getShortDescription());
			
			//get "DESCRIPTION_LONG" and set the value for product
			NodeList description_long = article.getElementsByTagName("DESCRIPTION_LONG");
			if(tagExists(description_long)){
				product.setLongDescription(description_long.item(0).getChildNodes().item(0).getNodeValue());
				System.out.println("description_long" + product.getLongDescription());
			}

			
			//find the same product in db
			BOProduct sameProductInDB = ProductBOA.getInstance().findByOrderNumberSupplier(product.getOrderNumberSupplier());
			
			if(sameProductInDB != null){
				if(!sameProductInDB.equals(product)){
					//Product already in DB
					deleteProduct(sameProductInDB);
					ProductBOA.getInstance().saveOrUpdate(product);
					insertPrices(article, product);
					errorList.add("INFO: Product " + product.getShortDescription() + " updated");
					countUpdated++;
				}
			} else {
				//Product not in DB
				ProductBOA.getInstance().saveOrUpdate(product);
				insertPrices(article, product);
				errorList.add("INFO: Product " + product.getShortDescription() + " added");		
				countAdded++;
			}
		}	 
		errorList.add("INFO: Summary: "+countUpdated+ " products updated, "+countAdded+" added");	
		//commits and closes this transaction
		_BaseBOA.getInstance().commit();
		return product;	
	}
	
	/*
	  checks if xml tag exists
	 */
	private boolean tagExists(NodeList nodes){
		if(nodes.getLength()>0){
			Node node = nodes.item(0);
			Node child = node.getFirstChild();
			if(child == null){
				return false;
			} else{
				return true;
			}
		}
		return false;
	}
	
	/*
	  makes the operations with the DB: inserts prices
	 */
	
	private void insertPrices(Element article, BOProduct bp) {
		NodeList articlePrices = article.getElementsByTagName("ARTICLE_PRICE");
		BOSalesPrice salesPrice = new BOSalesPrice();
		BOPurchasePrice boPrice = new BOPurchasePrice();
		
		// Get Price Amount and get if exist Price_Type and Tax otherwise set Default for this parameter

		for (int i = 0; i < articlePrices.getLength(); i++) {
			Element articlePriceElement = (Element) articlePrices.item(i);
			NodeList articlePriceAmountList = articlePriceElement.getElementsByTagName("PRICE_AMOUNT");
			String priceType;
			if(articlePriceElement.getAttribute("price_type") != null)
				priceType = articlePriceElement.getAttribute("price_type");
			else
				priceType = "net_list";
			BigDecimal pAmount = BigDecimal.valueOf(Double.valueOf(articlePriceAmountList.item(0).getFirstChild().getNodeValue()));
			BigDecimal tax;
			if(articlePriceElement.getElementsByTagName("TAX").getLength() > 0) {
				NodeList taxes = articlePriceElement.getElementsByTagName("TAX");
				Double taxDouble = Double.valueOf(taxes.item(0).getFirstChild().getNodeValue());
				tax = BigDecimal.valueOf(taxDouble);
			} else {
				tax = BigDecimal.valueOf(Double.valueOf(0.1900));
			}
			salesPrice.setProduct(bp);
			// The Profit margin is 2,5
			salesPrice.setAmount(pAmount.multiply(new BigDecimal(2.5)));
			salesPrice.setPricetype(priceType);
			salesPrice.setTaxrate(tax);
			salesPrice.setCountry(new BOCountry(new Country("DE")));
			salesPrice.setLowerboundScaledprice(1);
			boPrice.setProduct(bp);
			boPrice.setAmount(pAmount);
			boPrice.setPricetype(priceType);
			boPrice.setTaxrate(tax);
			boPrice.setCountry(new BOCountry(new Country("DE")));
			boPrice.setLowerboundScaledprice(1);
			PriceBOA.getInstance().saveOrUpdateSalesPrice(salesPrice);
			PriceBOA.getInstance().saveOrUpdatePurchasePrice(boPrice);
		}
	}
	
	/*
	  Deletes products from the DB 
	  @param product the product to be deleted
	 */
	public void deleteProduct(BOProduct product){
		ProductBOA.getInstance().delete(product);
		_BaseBOA.getInstance().commit();
	}

}
