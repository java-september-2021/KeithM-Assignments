<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
		
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
		
	
		<header>
		<h1 class="header">Questions Dashboard</h1>
		</header>
		<table class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
			<thead>           
            	<tr>
                	<th>Question</th>
           		    <th>Tags</th>
            	</tr>
            </thead>
            <tbody>
            	<c:forEach items="${allQuestions}" var="question">
                <tr>
                	<td><a href="/question/${question.id}"><c:out value="${question.question}"/></a></td>
                	<td>
                		<c:forEach items="${question.tags}" var="tag">
                			<span>${tag.subject}<c:if test="${ question.tags.indexOf(tag) != question.tags.size() - 1 }">, </c:if></span>
                		</c:forEach>
                	</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	
		<a href="/question/new"><button>New Question</button></a>
		
	

	</body>
</html>