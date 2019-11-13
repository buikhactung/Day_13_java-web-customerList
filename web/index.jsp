<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 13/11/2019
  Time: 2:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Danh sách khách hàng</title>
    <style>
      table, tr, td {
        border: 1px solid grey;
      }
    </style>
  </head>
  <body>
<table>

  <tr>
    <td>Tên khách hàng</td>
    <td>Ngày sinh</td>
    <td>Địa chỉ</td>
    <td>Ảnh</td>
  </tr>
<c:forEach items="${customer}" var="customer">
  <tr>
    <td>${customer.getName()}</td>
    <td>${customer.getDate()}</td>
    <td>${customer.getAddress()}</td>
    <td>
      <img src="${customer.getImage()}" height="100" width="100">

    </td>

  </tr>
</c:forEach>
</table>


  </body>
</html>
