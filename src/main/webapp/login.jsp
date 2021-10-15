<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/14/21
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password =  request.getParameter("password");

    if(username != null && password != null){

    if(username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }
   }

%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>

<form method="POST">
        <label for="username"></label>
            <input type="text" placeholder="username" id="username" name="username">
    <br>
    <br>
        <label for="password"></label>
            <input type="password" placeholder="password" id="password" name="password">
    <br>
    <br>
    <button type="submit">submit</button>
</form>
<div>
    <%= username %>
</div>
</body>
</html>
