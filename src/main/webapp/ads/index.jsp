<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/19/21
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Showing all ads" />
  </jsp:include>
</head>
<body>

<jsp:include page="partials/head.jsp">
  <h1>Ads</h1>

  <c:forEach var ="ad" items="${ads}">
    <h3>${ad.title}</h3>
    <p>${ad.description}</p>

  </c:forEach>

    <div>


    </div>

</body>
</html>
