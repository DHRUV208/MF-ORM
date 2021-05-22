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
<title>Our Customers</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>hello These are all our registerd customers</h1>

<div class="card-columns">
<c:forEach items="${list}" var="item">
    <div class="card" style="width:300px">
    <c:if test="${item.gender== 'Male' }"><img class="card-img-top mx-auto" src="resources/images/maleAvatar.png" alt="Card image" style="width:50%"></c:if>
    <c:if test="${item.gender== 'Female' }"><img class="card-img-top mx-auto" src="resources/images/femaleAvatar.jpg" alt="Card image" style="width:50%"></c:if>
    <div class="card-body">
      <h4 class="card-title"><c:out value="${item.name}"></c:out></h4>
      <p class="card-text"><c:out value="${item.email}"></c:out> <br><c:out value="${item.address}"></c:out></p>
      <%--<a href="#" class="btn btn-primary">See Profile</a>**/--%>
    </div>
  </div> <br>
</c:forEach>
</div>

</body>
</html>