<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
		
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
	
		<a href="/dojo/new"><button>New Dojo</button></a>
		<a href="/ninja/new"><button>New Ninja</button></a>
		
		<c:forEach items="${allDojos}" var="dojo">
		
			<h1><c:out value="${dojo.name}"/></h1>
		
			<table class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
				<thead>           
	            	<tr>
	           		    <th>First Name</th>
	                	<th>Last Name</th>
	                	<th>Age</th>

	            	</tr>
	            </thead>
	            <tbody>
	            	<c:forEach items="${dojo.ninjas}" var="ninja">
	                <tr>
	                	<td><c:out value="${ninja.firstname}"/></td>
	                	<td><c:out value="${ninja.lastname}"/></td>
	                	<td><c:out value="${ninja.age}"/></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:forEach>
	

	</body>
</html>