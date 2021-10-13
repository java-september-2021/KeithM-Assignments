<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Dojo</title>
	</head>
	<body>
	
		<h1>New Dojo</h1>
		
		<form:form action="/dojo/newDojo" method="POST" modelAttribute="dojo">
		
			<form:label path="name">Location Name</form:label>
			<form:input type="text" path="name"/><br><br>

			<button>Create Dojo</button><br><br>
			
			<form:errors path="name"/><br><br>

			
		</form:form>
		
		<a href="/"><button>Home</button></a>
		
		
		
	</body>
</html>