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

        <meta charset="UTF-8">
        <title>Title</title>

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
        <link href="resources/style2.css" rel="stylesheet">

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

        <br>
        <div>
            <h3>You are ready to go!</h3>
        </div>

        <br>

            <div>
                <form:input path="fname" placeholder="${fname}" type="text" disabled="true"/>
            </div>
            <div>
                <form:input path="lname" placeholder="${lname}" type="text" disabled="true"/>
            </div>
            <div>
                <form:input path="dob" placeholder="${dob}" type="text" disabled="true"/>

            </div>
            <div>
                <form:input path="about" placeholder="${about}" type="text" disabled="true"/>

            </div>
            <div>
                <form:input path="hobby" placeholder="${hobby}" type="text" disabled="true"/>

            </div>
            <br>


    </div>
    <div class= "section" id="right">
        <div id="image">
            <img src="resources/images/Design.png" alt="" srcset="">
        </div>
    </div>
</div>

</body>
</html>
