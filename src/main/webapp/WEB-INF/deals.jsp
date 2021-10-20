<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <jsp:include page="../partials/head.jsp">
    <jsp:param name="title" value="Deals" />
  </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<h2>Hi, ${name}! We have some awesome deals on ${favorite} cookies!</h2>
<c:choose>
  <c:when test="${!approved}">
    <p>But first, answer one question:</p>
    <form method="Post" action="Deals">
      <legend>Cupcake or Muffin?</legend>
      <fieldset>
        <ul>
          <li>
            <label for="cupcake">Cupcake</label>
            <input type="radio" id="cupcake" name="cupcakeOrMuffin" value="cupcake">
          </li>
          <li>
            <label for="muffin">Muffin</label>
            <input type="radio" id="muffin" name="cupcakeOrMuffin" value="muffin">
          </li>
        </ul>
        <button type="submit">Submit</button>
      </fieldset>
    </form>
  </c:when>
  <c:when test="${approved}">
    <h2>Long list of deals:</h2>
    <ol>
      <li>Deal</li>
      <li>Deal</li>
    </ol>
  </c:when>
</c:choose>
</body>
</html>