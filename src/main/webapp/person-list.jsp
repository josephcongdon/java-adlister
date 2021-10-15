<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Person" %><%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/14/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%
List<Person> people = new ArrayList<>(Arrays.asList(
        new Person(1, "George", "Castanza", 39),
        new Person(2, "Thomas", "Anderson", 35),
        new Person(3, "Pepper", "Potts", 30)
    ));

    request.setAttribute("people", people);
%>


<html>
<head>
    <title>Person List</title>
</head>
<style>
    body{
        background-color: bisque;
    }
</style>
<body>

    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last NAme</th>
            <th>Age</th>
        </tr>
        <tr>
            <c:forEach var="person" items="${people}">
                <td>${person.id}</td>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                <p>${person.age}</p>
            </c:forEach>
        </tr>
    </table>

</body>
</html>
