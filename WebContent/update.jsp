<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,java.math.BigDecimal,de.htwg_konstanz.ebus.framework.wholesaler.vo.util.PriceUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.List" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title>eBusiness Framework Demo - Update</title>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="pragma" content="no-cache">
	<link rel="stylesheet" type="text/css" href="default.css">
</head>
	
<body>
	
	<%@ include file="header.jsp" %>
	<%@ include file="error.jsp" %>
	<%@ include file="authentication.jsp" %>
	<%@ include file="navigation.jspfragment" %>
	<script type="text/javascript">
		function validateUpload(){
			if(document.getElementById("xmlFile").value !== ""){
				document.getElementById("upload").submit();
			} else {
				alert("No File attached. Please select your XMLCatalog!");
			}	
		}
	</script>
	<h1>Update: Select Supplier</h1>
	<form id="upload" name="upload" action="controllerservlet?action=import" enctype="multipart/form-data" method="POST">
		<label>Please, select your file:</label>
		<br>
		<br>
		<input type="file" name="xmlFile" id="xmlFile"/>
<!-- 		<br> -->
		<input type="button" value="Upload" onclick="validateUpload()"/>
	</form>

	<form id="upload" name="upload" action="controllerservlet?action=update" enctype="multipart/form-data" method="POST">
  <input type="search" list = "supplier" />
  <datalist id = "supplier">
    <option value = "HTWG Konstanz"> 
    <option value = "Sportscheck"> 
  </datalist> 
  <input type="submit" value="submit">
</form>

<p>Select supplier</p>
<%-- <%! List<BOSupplier> suppliers; %> --%>
<%-- <% for (BOSupplier supplier : suppliers) {  --%>
<%--// 	out.write(supplier.getCompanyname());--%>
	
<%--  } %> --%>

<div>
		<form method="post" action="controllerservlet">
		<input type="hidden" name="action" value="showUpdates">
			<div>
		<select name="<%=Constants.PARAM_SUPPLIER%>">
					<c:forEach var="supplier" items="${sessionScope.supplierList}">
						<jsp:useBean id="supplier"
							type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier" />
						<option value="<%=supplier.getSupplierNumber()%>"><%=supplier.getCompanyname()%></option>
					</c:forEach>
				</select>
			</div>
			<br>
			<div>
				<input type="submit" value="Show Updates">
			</div>

		</form>
	</div>





</body>
</html>