<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Category</title>
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
	
			<h1>New Product</h1>
		
			<form method="POST" action="/product/new/create" >
		
			<label>Product Name:</label>
			<input type="text" name="name"/><br><br>
			
			<label>Product Description:</label>
			<input type="text" name="description"/><br><br>
			
			<label>Product Price:</label>
			<input type="number" name="price" step="0.01"/><br><br>

			<button>Create Product</button><br><br>

			
			</form>
		
		
		
	</body>
</html>