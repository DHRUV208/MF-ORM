<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <link href="resources/style.css" rel="stylesheet">
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
            <h3>Create your free account</h3>
        </div><br>
        <form:form action="login3" method="post" modelAttribute="ModelAttrib">
            <div>
                <form:input path="name" placeholder="Username" type="text"/>
            </div>
            <div>
                <form:input path="email" placeholder="Email ID" type="email"/>
            </div>
            <div>
                <form:input path="password" placeholder="Password" type="password"/>

            </div>
            <br>
            <input type="submit" value="Create Account">
        </form:form>
    </div>
    <div class= "section" id="right">
        <div id="image">
            <img src="resources/images/Design.png" alt="" srcset="">
        </div>
    </div>
    </div>
    
</body>
</html>