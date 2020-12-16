<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 16.12.2020
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BoardGames</title>
</head>
<body>
<section>
    <h3>Boardgames</h3>
    <jsp:useBean id="BG" scope="request" type="Model.ModelBG"/>
</section>
</body>
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>PRICE</td>
        <td>CREATOR</td>
    </tr>
    <c:forEach items="${BG}" var = "d"><tr>
    <td>${d.id}</td>
    <td>${d.name}</td>
    <td>${d.price}</td>
    <td>${d.creator}</td>
</tr></c:forEach></table>
</html>
