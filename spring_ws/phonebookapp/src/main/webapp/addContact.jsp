<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

</body>
</html>