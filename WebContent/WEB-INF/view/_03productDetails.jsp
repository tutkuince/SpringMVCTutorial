<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${product.manufacturer ${product.name }</h1>
	<p>
		<b>Product Id </b> ${product.productId }
	</p>
	<p>
		<b>Category </b> ${product.category}
	</p>
	<p>
		<b>Unit Price </b> ${product.unitPrice}
	</p>
	<p>
		<b>Units In Stock </b> ${product.unitsInStock}
	</p>
	<p>
		<b>Condition </b> ${product.condition}
	</p>
	<p>
		<b>Manufacturer </b> ${product.manufacturer }
	</p>
	<p>
		<b>Description </b> ${product.description}
	</p>


</body>
</html>