<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,java.math.BigDecimal,de.htwg_konstanz.ebus.framework.wholesaler.vo.util.PriceUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title>eBusiness Framework Demo - Import</title>
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
	<h1>Import: Import Product Catalog</h1>
	<form id="upload" name="upload" action="controllerservlet?action=import" enctype="multipart/form-data" method="POST">
		<label>Please, select your file:</label>
		<br>
		<br>
		<input type="file" name="xmlFile" id="xmlFile"/>
<!-- 		<br> -->
		<input type="button" value="Upload" onclick="validateUpload()"/>
	</form>
</body>
</html>