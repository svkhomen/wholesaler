package de.htwg_konstanz.ebus.wholesaler.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;
import de.htwg_konstanz.ebus.wholesaler.demo.LoginBean;
import de.htwg_konstanz.ebus.wholesaler.main.Export;

public class ExportAction implements IAction {
	private static final String ACTION_EXPORT = "export";
	public static final String PARAM_LOGIN_BEAN = "loginBean";

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response, ArrayList<String> errorList) {

		// get the login bean from the session
		LoginBean loginBean = (LoginBean) request.getSession(true)
				.getAttribute(PARAM_LOGIN_BEAN);

		// ensure that the user is logged in
		if (loginBean != null && loginBean.isLoggedIn()) {
			// ensure that the user is allowed to execute this action
			// (authorization)
			// at this time the authorization is not fully implemented.
			// -> use the "Security.RESOURCE_ALL" constant which includes all
			// resources.

			if (Security.getInstance().isUserAllowed(loginBean.getUser(),
					Security.RESOURCE_ALL, Security.ACTION_READ)) {
				//final list of found products
				List<BOProduct> products;
				//get Parameters from servlet action (export.jsp-> servlet)
				//BMECAT or XHTML
				String viewAction = (String) request.getParameter("view");
				//search string for certain products
				String searchTerm = (String) request.getParameter("searchField");
				
				Export export = new Export();
				
				//export all products
				if(searchTerm == null){
					products = ProductBOA.getInstance().findAll();
					
					if("BMECAT".equals(viewAction) || "XHTML".equals(viewAction)){
						System.out.println("all products");
						try {
							//method in Export to convert the products in BMECAT or XHTML
							export.doExport(viewAction, response, products);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				//export certain products with short description 
				}else{
					products = ProductBOA.getInstance().findByCriteriaLike("Shortdescription", "%" + searchTerm + "%");
					
					if("BMECAT".equals(viewAction) || "XHTML".equals(viewAction)){
						System.out.println(products.size() + " products are ready to export");
						try {
							//method in Export to convert the products in BMECAT or XHTML
							export.doExport(viewAction, response, products);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				return "export.jsp";
			} else {
				// authorization failed -> show error message
				errorList.add("You are not allowed to perform this action!");

				// redirect to the welcome page
				return "welcome.jsp";
			}
		} else {
			// redirect to the login page
			return "login.jsp";
		}
	}

	public boolean accepts(String actionName) {

		return actionName.equalsIgnoreCase(ACTION_EXPORT);
	}
}