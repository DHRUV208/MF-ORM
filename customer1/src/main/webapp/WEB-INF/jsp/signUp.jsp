<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@                                  page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Font Awesome Icon Library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href = "resources/css/style.css" rel ="stylesheet">
<title>sign up</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<c:if test="${page == 'signUp'}">
<h1>Great lets get started</h1>
  <form:form action = "register"  method = "post" modelAttribute="customer">
     Name:
     <form:input path="name" placeholder ="NAME"/>
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
         
     <form:button type = "submit">Register</form:button>
     
  </form:form> 
</c:if>

<c:if test="${page=='register' || page == 'success' }">

<h1>Welcome <c:out value="${customer.getName() }"></c:out>. you have been registerd.</h1>
 <table style="width:100%" id="customers">
  <tr>
    <th>Name:</th>
    <td><c:out value="${customer.getName() }"></c:out>  </td>
  </tr>
  <tr>
  <th>Gender:</th>
    <td><c:out value="${customer.getGender() }"></c:out></td>
  </tr>
  <tr>
  <th>Address:</th>
    <td><c:out value="${customer.getAddress() }"></c:out></td>
  </tr>
  <tr>
  <th>Number:</th>
    <td><c:out value="${customer.getPhnNum() }"></c:out></td>
  </tr>
  <tr>
  <th>Email:</th>
    <td><c:out value="${customer.getEmail() }"></c:out></td>
  </tr>
    <tr>
    <th>Income:</th>
    <td><c:out value="${customer.getIncome() }"></c:out></td>
  </tr>
  <tr>


</table> 
<form action="editProfile">
<button type = "submit">Edit</button>
<input type = "hidden" name = "email" value = <c:out value="${customer.getEmail() }"></c:out>>
</form>

<form action="deleteProfile">
<button type = "submit">Delete Profile</button>
<input type = "hidden" name = "email" value = <c:out value="${customer.getEmail() }"></c:out>>
</form>
<br><br>
<h3>Other customer Rating</h3>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
<span class="fa fa-star"></span>

<%-- <a href ="cart">cart</a>--%>
</c:if>
</body>
</html>