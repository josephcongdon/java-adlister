<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/14/21
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String myFirstName = "Joe";
    String firstName = myFirstName.substring(0,3);
%>

<html>
<head>
    <title>intro-to-jsp</title>
    <style>
        /*body {*/
        /*    background-color: blue;*/
        /*}*/
    </style>
</head>
<body>
    <h1>My first JSP</h1>

<p>hello <%= firstName%></p>
</body>
</html>
