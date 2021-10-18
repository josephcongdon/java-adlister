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
        <input type="checkbox" id="topping1" name="toppings" value="pepperoni">
        <label for="topping1">Pepperoni</label>
      </tr>
        <br>
      <tr>
        <input type="checkbox" id="topping2" name="toppings" value="sausage">
        <label for="topping2">Sausage</label>
      </tr>
        <br>
      <tr>
        <input type="checkbox" id="topping3" name="toppings" value="bacon">
        <label for="topping3">Bacon</label>
      </tr>
      <td>
        <label for="crust"></label>
        <select name = "crust" id="crust" form="pizza-form">
          <option value="pan">pan</option>
          <option value="stuff">stuff</option>
          <option value="deep dish">deep dish</option>
          <option value="thin">thin</option>
        </select>
      </td>

      <td>
        <label for="sauce"></label>
        <select name="sauce" id="sauce" form="pizza-form">
          <option value ="classic">classic</option>
          <option value ="white">white</option>
          <option value ="bbq">bbq</option>
          <option value ="chili">chili</option>
        </select>
      </td>

      <td>
        <label for="size"></label>
        <select name="size" id="size" form="pizza-form">
          <option value="personal">personal</option>
          <option value="small">small</option>
          <option value="medium">medium</option>
          <option value="Large">Large</option>
        </select>
      </td>

  </table>
  <br>
  <label for="address">Please enter your address</label>
  <br>
  <input type="text" name="address" id="address" placeholder="please enter delivery address"/>
  <input type="submit" name="submit"/>
</form>

</body>
</html>
