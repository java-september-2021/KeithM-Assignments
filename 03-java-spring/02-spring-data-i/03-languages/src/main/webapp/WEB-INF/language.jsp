<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Language</title>
	</head>
	<body>
	
		<h1>Language</h1>
		
        <p>Name of Language:  <c:out value="${language.name}"/></p><br><br>
        <p>Name of Creator:  <c:out value="${language.creator}"/></p><br><br>
        <p>Version Number:  <c:out value="${language.version}"/></p><br><br>
		
		
		<a href="/"><button>Back</button></a>
		
	</body>
</html>