<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Category</title>
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
		
		
	</head>
	<body>
		
		<p><c:out value="${category.name}" /></p>
		
		<br>
		<h2>Products</h2>
		
			<ul>
				<c:forEach items="${category.products}" var="product">
				<li>${product.name}</li>
				</c:forEach>		
			</ul>
		
		<br><br>
		<form method="POST" action="/addProductToCategory/${category.id}">
		
			<select name="products">
				<c:forEach items="${nonGroupedProduct}" var="product">
					<option value="${product.id}">${product.name}</option>
				</c:forEach>			
			</select>
			
			<button>Add</button>
					
		</form>
		
		<br><br>
		
		<a href="/product/new"><button>Add New Product</button></a>
		<a href="/category/new"><button>Add New Category</button></a>
		
		
	</body>
</html>