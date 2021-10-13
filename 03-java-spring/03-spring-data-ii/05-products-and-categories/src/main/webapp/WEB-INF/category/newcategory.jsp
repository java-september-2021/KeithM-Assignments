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
	
			<h1>New Category</h1>
		
			<form method="POST" action="/category/new/create">
		
			<label>Category Name:</label>
			<input type="text" name="name"/><br><br>

			<button>Create Category</button><br><br>
			
			</form><br><br>

	
	</body>
</html>