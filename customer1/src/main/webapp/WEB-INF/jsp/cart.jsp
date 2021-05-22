<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>hello  ${customer1.getName()}</h1>
<br>
<h2>
${customer1.getEmail()}</h2>
</body>
</html>