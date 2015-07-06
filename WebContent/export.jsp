<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,de.htwg_konstanz.ebus.wholesaler.demo.util.Constants,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Orders</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">
<link rel="stylesheet" type="text/css" href="layout.css">
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>

<h1>Export: Export Product Catalog</h1>
<table>
	<tr>
		<td>Export all products</td>
		<td>  </td>
		<td>  </td>
		<td>  </td>
		<td>  </td>
		<td>  </td>
		<td>  </td>
		<td>  </td>
		<td><a href="<%= response.encodeURL("controllerservlet?action=export&view=BMECAT") %>">BMECAT</a><p>  </p>
		<a href="<%= response.encodeURL("controllerservlet?action=export&view=XHTML") %>">XHTML</a></td>
	</tr>
</table>
<p></p>
<table>
	<tr>
		<td>Export certain products</td>
		<form id="searchForm" method="post" action="controllerservlet?action=export&view=BMECAT">
			<input type="hidden" name="view" id="view" value="BMECAT"/>
			<td><input type="text" name="searchField" placeholder="short description"/></td>
			<td><button type="submit">BMECAT</button></td>
		</form> 
	</tr>
	<tr><td>
		<form id="searchForm2" method="post" action="controllerservlet?action=export&view=XHTML">
			<input type="hidden" name="view" id="view" value="XHTML"/>
		<td>	<input type="text" name="searchField" placeholder="short description"/></td>
		<td>	<button type="submit" >XHTML</button></td>
		</td>
		</form> 
		
	</tr>	
</table>
</body>
</html>