<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: VISUALCREATIVE
  Date: 4/14/2021
  Time: 12:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <title>Title</title>

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
        <link href="resources/style2.css" rel="stylesheet">
    </head>
</head>
<body>
<div class="main">

    <div class="section" id="left">
        <div>
            <h1>
                Contribute.
            </h1>

        </div>

        <br><br>
        <div>
            <h3>Welcome ${name}</h3>
        </div>
        <br>
        <div>
            <h4>Fill Your Details</h4>
        </div>

        <br>
        <form:form action="details" method="post" modelAttribute="ModelAttrib">
            <div>
                <form:input path="fname" placeholder="First Name" type="text"/>
            </div>
            <div>
                <form:input path="lname" placeholder="Last Name" type="text"/>
            </div>
            <div>
                <form:input path="dob" placeholder="Date of Birth" type="text"/>

            </div>
            <div>
                <form:input path="about" placeholder="About" type="text"/>

            </div>
            <div>
                <form:input path="hobby" placeholder="Hooby" type="text"/>

            </div>
            <br>
            <input type="submit" value="Submit">
        </form:form>
    </div>
    <div class= "section" id="right">
        <div id="image">
            <img src="resources/images/Design.png" alt="hello" srcset="">
        </div>
    </div>
</div>

</body>
</html>
