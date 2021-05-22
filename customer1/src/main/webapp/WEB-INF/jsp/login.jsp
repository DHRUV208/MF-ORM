<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@                                  page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "resources/css/style.css" rel ="stylesheet">
<title>Sign In</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<c:if test="${page=='login'}">
<h1>Welcome To Login Page</h1>
<c:if test="${error!=null }"><h1 class ="error"><c:out value="${error }"></c:out> </h1></c:if>
<form:form action = "signIn"  method = "post" modelAttribute="login">
EMAIL: <form:input path="email" type = "email" placeholder ="EMAIL"/><br><br>
PASSWORD: <form:input path="password" type = "password" placeholder ="PASSWORD"/><br><br>
<form:button type = "submit">Sign In</form:button>
</form:form></c:if>



</body>
</html>