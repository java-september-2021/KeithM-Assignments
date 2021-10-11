<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Language</title>
	</head>
	<body>
	
		<h1>New language</h1>
		
		<form:form action="/new" method="POST" modelAttribute="newLanguage">
		
			<form:label path="name">Language Name</form:label>
			<form:input type="text" path="name"/><br><br>
			
			<form:label path="creator">Creator Name</form:label>
			<form:input type="text" path="creator"/><br><br>
			
			<form:label path="version">Version</form:label>
			<form:input type="text" path="version"/><br><br>
			<button>Create Language</button><br><br>
			
			<form:errors path="name"/><br><br>
			<form:errors path="creator"/><br><br>
			<form:errors path="version"/><br><br>
			
		</form:form>
		
		
		
	</body>
</html>