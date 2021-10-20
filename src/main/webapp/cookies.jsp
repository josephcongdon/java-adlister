<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/19/21
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Cookies" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<c:if test="${not empty name}">
<h2>Hi, ${name}!
    </c:if>
    <c:choose>
    <c:when test="${not empty favorite}">
    &nbsp;Have you had any good ${favorite} cookies lately?</h2>
</c:when>
<c:otherwise>
    </h2>
</c:otherwise>
</c:choose>
<form method="POST" action="/Cookies">
    <ul>
        <li>
            <label for="name">What is your name?</label>
            <input type="text" name="name" id="name">
        </li>
        <li>
            <label for="favorite">What is your favorite cookie?</label>
            <input type="text" name="favorite" id="favorite">
        </li>
    </ul>
    <button type="submit">Submit</button>
</form>
</body>
</html>