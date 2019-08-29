<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<form:form action="add" method="post" modelAttribute="phonebook">
	
	Name : <form:input path="name"/><br>
	PhoneNo : <form:input path="phoneNo"/><br>
	Provider : <form:input path="provider"/><br>
	<input type="submit" value="add">
</form:form>

<table class="table table-hover">
<tr>
	<td>Name</td>
	<td>PhoneNo</td>
	<td>NetWork</td>
</tr>
<c:forEach items="${bookdata}" var="contact">
	<tr>
		<td><c:out value="${contact.name}"></c:out></td>
		<td><c:out value="${contact.phoneNo}"></c:out></td>
		<td><c:out value="${contact.provider}"></c:out></td>
		<td><a href="edit?id=${contact.id}" class="glyphicon glyphicon-edit"></a></td>
		<td><a href="delete?id=${contact.id}" class="glyphicon glyphicon-trash"></a></td>
		
	</tr>
</c:forEach>
</table>
</body>
</html>