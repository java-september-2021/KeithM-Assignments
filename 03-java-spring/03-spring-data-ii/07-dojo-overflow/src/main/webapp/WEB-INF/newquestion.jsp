<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Question</title>
		
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
	
		<a href="/" class="logout_button"><button >Home</button></a>
	
		<header>
		<h1>What is your question?</h1>
		</header>
		
		<form:form action="/question/new/create" method="POST" modelAttribute="question">
			
		<form:label path="question">Question</form:label><br>
		<form:textarea type="text" path="question" rows = "5" cols = "30"/><br><br>
		
		
		<form:label path="tags">Tags</form:label>
		<form:input path="tags"/><br><br>
		
		<button>Create Question</button><br><br>	
		
		<form:errors path="question"/><br>
		<form:errors path="tags"/><br><br>
		
		</form:form>
		
	
		<a href="/"><button>Home</button></a>
		
	

	</body>
</html>