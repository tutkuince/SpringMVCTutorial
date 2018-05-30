<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="newProduct" method="post">
		<fieldset>
			<legend>Add new Product</legend>
			<div>
				<label>Product Id</label>
				<div>
					<form:input path="productId" id="productId" type="text" />
				</div>
			</div>
			<div>
				<label>Name</label>
				<div>
					<form:input path="name" id="name" type="text" />
				</div>
			</div>
			<div>
				<label>Unit Price</label>
				<div>
					<form:input path="unitPrice" id="unitPrice" type="number" />
				</div>
			</div>
			<div>
				<label>Description</label>
				<div>
					<form:textarea path="description" id="description" />
				</div>
			</div>
			<div>
				<label>Manufacturer</label>
				<div>
					<form:select path="manufacturer">
						<form:option value="Apple" />
						<form:option value="Google" />
						<form:option value="Samsung" />
					</form:select>
				</div>
			</div>
			<div>
				<label>Category</label>
				<div>
					<form:select path="category">
						<form:option value="Laptop"></form:option>
						<form:option value="SmartPhone"></form:option>
						<form:option value="Tablet"></form:option>
					</form:select>
				</div>
			</div>
			<div>
				<label>UnitsInStock</label>
				<div>
					<form:input path="unitsInStock" id="unitsInStock" type="number" />
				</div>
			</div>
			<div>
				<label>Condition</label>
				<div>
					<form:radiobutton path="condition" value="New" />
					New
					<form:radiobutton path="condition" value="Old" />
					Old
					<form:radiobutton path="condition" value="Refurbished" />
					Refurbished
				</div>
			</div>
			<div>
				<input type="submit" value="Add">
			</div>
		</fieldset>
	</form:form>
</body>
</html>