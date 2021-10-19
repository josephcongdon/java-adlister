<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/18/21
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View All Products</title>
    <style>
        div {
            border: 2px solid black;
        }
    </style>
</head>
<body>

<h1>Products List</h1>

<c:forEach var="product" items="${products}">
    <div>
        <p>model.Product Name: ${product.name}</p>
        <p>Price In Cents: ${product.priceInCents}</p>
    </div>
</c:forEach>


</body>
</html>

