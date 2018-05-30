<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="productUrlAll"
	value="${pageContext.request.contextPath }/products/productList" />
<c:set var="productUrlCategory"
	value="${pageContext.request.contextPath }/products/category" />
<c:set var="matrixUrl"
	value="${pageContext.request.contextPath }/products/brand" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	function prepareMatrix() {

		var selectedBrands = "";
		$('input:checkbox[name=brand]').each(function() {
			if ($(this).is(':checked'))
				selectedBrands = selectedBrands + $(this).val() + ",";
		});

		var url = '${matrixUrl}/brands=' + selectedBrands;

		$("#search").attr("href", url);
	}
</script>
</head>
<body>

	<div>

		<ul class="sidebar-nav">
			<li class="sidebar-brand">Brands</li>

			<li><label class="label-align"> <input type="checkbox"
					name="brand" value="apple"><span>Apple</span>
			</label></li>

			<li><label class="label-align"> <input type="checkbox"
					name="brand" value="google"><span>Google</span>
			</label></li>
			<li><label class="label-align"> <input type="checkbox"
					name="brand" value="samsung"><span>Samsung</span>
			</label></li>
		</ul>
		<a style="margin-left:40px" onclick="prepareMatrix()"  id="search" class="btn btn-success"> <span>Search </span></a>

		<h1>Products</h1>
		<ul>
			<li class=""><a href="${productUrlAll}">All Products</a></li>
			<li><a href="${productUrlCategory}/laptop">Laptops</a></li>
			<li class=""><a href="${productUrlCategory}/tablet">Tablets</a>
			</li>
			<li class=""><a href="${productUrlCategory}/smartPhone">Smart
					Phones</a></li>
		</ul>
		<ul>
			<c:forEach items="${products }" var="product">
				<li>${product.name }
					<ul>
						<li><b>Description</b> ${product.description }</li>
						<li><b>Unit Price</b> ${product.unitPrice}USD</li>
						<li>Available <b>${product.unitsInStock }</b> units in stock
						</li>
						<li><a
							href="<c:url value="/products/productDetail?id=${product.productId }"/>">Go
								Full Details </a></li>
					</ul>
				</li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>
