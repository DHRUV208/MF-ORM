<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Home Page</title>

</head>
<body>
${username}
<h1>HTTP SERVLET FORM</h1>
<form action="login" method="post">
    <label>
        <input type="text" name="name">
        <input type="password" name="password">
    </label>
    <button type="submit">Login</button>
</form>
<h1>REQUEST PARAM FORM</h1>
<form action="login2" method="post">
    <label>
        <input type="text" name="name">
        <input type="password" name="password">
    </label>
    <button type="submit">Login</button>
</form>
<h1>MODEL FORM</h1>
<form:form action="login3" method="post" modelAttribute="modelAtt">
    <form:input path="name"/>
    <form:input path="password"/>
    <form:button>Login</form:button>
</form:form>
</body>
</html>