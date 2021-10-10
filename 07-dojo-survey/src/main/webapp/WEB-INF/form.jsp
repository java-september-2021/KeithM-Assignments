<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form</title>
	</head>
	<body>
		
		<h1>Form</h1>
		
		
		<form method="POST" action="/store">
    		<label>Name: <input type="text" name="name"></label><br><br>
    		<label>Dojo Location:</label>
				<select name="location">
  					<option value="SanJose">San Jose</option>
  					<option value="Seattle">Seattle</option>
  					<option value="Tulsa">Tulsa</option>
  					<option value="Dallas">Dallas</option>
				</select><br><br>
    		<label>Favorite Language:</label>
				<select name="language">
  					<option value="Java">Java</option>
  					<option value="Python">Python</option>
  					<option value="HTML">HTML</option>
				</select><br><br>
			<label>Comment (optional):</label><br><br>
			<input type="text" name="comment"><br><br>			
			<button>Submit</button>
		</form>


		
		
	</body>
</html>