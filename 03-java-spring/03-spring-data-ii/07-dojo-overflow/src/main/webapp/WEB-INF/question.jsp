<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Question</title>
		
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <link rel="stylesheet" href="/css/style.css">
        
	</head>
	<body>
	
		<a href="/" class="logout_button"><button >Home</button></a>
	
		<header>
		<h1><c:out value="${question.question}"/></h1>
		</header>
	
	<div class="content">	
		<div class="view_answer">
		<p>
		<c:forEach items="${question.tags}" var="tag">
			<c:out value="${tag.subject}"/>  
		</c:forEach>
		</p>
		
		<table class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
			<thead>           
            	<tr>
                	<th>Answers</th>
            	</tr>
            </thead>
            <tbody>
            	<c:forEach items="${question.answers}" var="answer">
                <tr>
                	<td><c:out value="${answer.answer}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
			<a href="/question/new"><button>New Question</button></a>
		</div>
		
	<div class="add_answer">
				
		<header>
		<h1>Answer</h1>
		</header>
		
		<form:form action="/addAnswer" method="POST" modelAttribute="answers">
			
		<form:label path="answer">Answer</form:label><br>
		<form:textarea type="text" path="answer" rows = "5" cols = "30"/><br><br>
		<form:hidden path="answeredQuestion" value="${ question.id }"/>
		
		<button>Add Answer</button><br><br>	
		
		<form:errors path="answer"/><br>
		
		</form:form>
			
		
		</div>
	</div>

	</body>
</html>