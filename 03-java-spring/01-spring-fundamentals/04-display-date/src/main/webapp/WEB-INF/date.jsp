<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/date.js"></script>

</head>
<body>

	<a href="/">Back</a>

	<h1><c:out value="${day}"/> the <c:out value="${dayNumber}"/> of <c:out value="${month}"/>, <c:out value="${year}"/></h1>
	


</body>
</html>