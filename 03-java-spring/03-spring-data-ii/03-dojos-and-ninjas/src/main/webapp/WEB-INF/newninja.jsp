<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Ninja</title>
	</head>
	<body>
	
		<h1>New Ninja</h1>
		
		<form:form action="/ninja/newNinja" method="POST" modelAttribute="ninja">
		
			<form:label path="dojoLocation">First Name</form:label>
			<form:select type="text" path="dojoLocation">
			
				<c:forEach items="${dojos}" var="dojo">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			
			</form:select>
			<br><br>
			
			<form:label path="firstname">First Name</form:label>
			<form:input type="text" path="firstname"/><br><br>
			
			<form:label path="lastname">Last Name</form:label>
			<form:input type="text" path="lastname"/><br><br>
			
			<form:label path="age">Age</form:label>
			<form:input type="text" path="age"/><br><br>
			<button>Create Ninja</button><br><br>
			
			<form:errors path="firstname"/><br><br>
			<form:errors path="lastname"/><br><br>
			<form:errors path="age"/><br><br>
			
		</form:form>
		
		
		<a href="/"><button>Home</button></a>
		
		
	</body>
</html>