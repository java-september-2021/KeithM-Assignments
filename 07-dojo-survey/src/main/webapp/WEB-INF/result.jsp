<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		
		<h1>Form Results</h1>
		
		<p> Name: <c:out value="${name}"/> </p><br>
		<p> Location: <c:out value="${location}"/> </p><br>
		<p> Favorite Language: <c:out value="${language}"/> </p><br>
		<p> Comment: <c:out value="${comment}"/> </p><br>
		
	</body>
</html>