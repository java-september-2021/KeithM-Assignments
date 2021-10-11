<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
				<h1>Edit language</h1>
		
		<form:form action="/edit/${language.id}" method="POST" modelAttribute="language">
		
			<form:label path="name">Language Name</form:label>
			<form:input type="text" path="name"/><br><br>
			
			<form:label path="creator">Creator Name</form:label>
			<form:input type="text" path="creator"/><br><br>
			
			<form:label path="version">Version</form:label>
			<form:input type="text" path="version"/><br><br>
			<button>Edit Language</button><br><br>
			
			<form:errors path="name"/><br><br>
			<form:errors path="creator"/><br><br>
			<form:errors path="version"/><br><br>
			
		</form:form>
	
	
		<a href="/"><button>Back</button></a>
		
	</body>
</html>