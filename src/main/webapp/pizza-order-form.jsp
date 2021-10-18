<%--
  Created by IntelliJ IDEA.
  User: josephcongdon
  Date: 10/17/21
  Time: 1:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza-Order-Form</title>
</head>
<body>

<form id="pizza-form" method="post">
  <table>
    <tr>
      <th>1. Toppings</th>
      <th>2. Crust Type</th>
      <th>3. Sauce Type</th>
      <th>4. Size </th>
    </tr>
    <tr>
      <td>topping item
        <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
        <label for="topping1">Pepperoni</label>
        <br>
        <label></label>
        <label></label>
      </td>
      <td>
        <select name = "crust" form="pizza-form">
          <option value="pan">pan</option>
          <option value="stuff">stuff</option>
          <option value="deep dish">deep dish</option>
          <option value="thin">thin</option>
        </select>
      </td>
      <td>
        <select name="sauce" form="pizza-form">
          <option value ="classic">classic</option>
          <option value ="white">white</option>
          <option value ="bbq">bbq</option>
          <option value ="chili">chili</option>
        </select>
      </td>
      <td>
        <select name="size" form="pizza-form">
          <option value="personal">personal</option>
          <option value="small">small</option>
          <option value="medium">medium</option>
          <option value="Large">Large</option>
        </select>
      </td>
    </tr>
  </table>
  <br>
  <input type="text" placeholder="please enter delivery address"/>
  <input type="submit" name="submit"/>
</form>

</body>
</html>
