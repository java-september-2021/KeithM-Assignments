<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
		
		<p><c:out value="${product.name}" /></p>
		<p><c:out value="${product.description}" /></p>
		<p><c:out value="${product.price}" /></p>
		
		<br>
		<h2>Categories</h2>
		
			<ul>
				<c:forEach items="${product.categories}" var="category">
				<li>${category.name}</li>
				</c:forEach>		
			</ul>
		
		<br><br>
		<form method="POST" action="/addCategoryToProduct/${product.id}">
		
			<select name="categories">
				<c:forEach items="${nonGroupedCategory}" var="category">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>			
			</select>
			
			<button>Add</button>
					
		</form>
		
		<br><br>
		
		<a href="/product/new"><button>Add New Product</button></a>
		<a href="/category/new"><button>Add New Category</button></a>
		
		
	</body>
</html>