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
<title>Edit Profile</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
 <h1>Welcome <c:out value="${customer.getName() }"></c:out>. You Are In Edit Mode.</h1>
 

  <form:form action = "edited"  method = "post" modelAttribute="customer">
     Name:
     <form:input path="name"   placeholder ="NAME"/>
     <form:errors path = "name" cssClass="error"></form:errors>
     <br><br> 
     
        Gender:   
        Male <form:radiobutton path="gender" value="Male"/>  
        Female <form:radiobutton path="gender" value="Female"/> 
        <br><br> 
        
        Phone Number:
     <form:input path="phnNum" placeholder = "NUMBER"/>
     <form:errors path = "phnNum" cssClass="error"></form:errors>
     <br><br> 
     
        Address: <form:select path="address">  
        <form:option value="Ghaziabad" label="Ghaziabad"/>  
        <form:option value="Modinagar" label="Modinagar"/>  
        <form:option value="Meerut" label="Meerut"/>  
        <form:option value="Amristar" label="Amristar"/>  
        </form:select>  
        <br><br> 
        <br><br> 
           
        Email:
        <form:input path="email"  placeholder ="EMAIL"/>
        <form:errors path = "email" cssClass="error"></form:errors>
        <br><br> 
        
    Income: <form:select path="income">  
        <form:option value="5000" label="0-10000"/>  
        <form:option value="15000" label="10000-20000"/>  
        <form:option value="25000" label="20000-30000"/>  
        <form:option value="35000" label="30000-40000"/>  
        </form:select>  
        <br><br>      
        <br><br> 
        
        Password:
        <form:input path="password" type="password" placeholder ="PASSWORD"/>  
        <form:errors path = "password" cssClass = "error"></form:errors>
        <br><br> 
         
     <form:button type = "submit">Edit</form:button>
     
  </form:form> 



</body>
</html>