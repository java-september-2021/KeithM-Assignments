<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
		
		<table class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
			<thead>           
            	<tr>
                	<th>ID</th>
           		    <th>Language</th>
                	<th>Creator</th>
                	<th>Version</th>
                	<th>Control</th>
            	</tr>
            </thead>
            <tbody>
            	<c:forEach items="${allLanguages}" var="language">
                <tr>
                	<td><c:out value="${language.id}"/></td>
                	<td><c:out value="${language.name}"/></td>
                	<td><c:out value="${language.creator}"/></td>
                	<td><c:out value="${language.version}"/></td>
                	<td>
                		<a href="/show/${language.id}">Show</a> | 
                		<a href="/edit/${language.id}">Edit</a> | 
               			<a href="/delete/${language.id}">Delete</a>
                	</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="/new"><button>New Language</button></a>
	

	</body>
</html>