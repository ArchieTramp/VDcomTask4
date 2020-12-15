<%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 16.12.2020
  Time: 0:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SkillToys</title>
</head>
<body>
</body>
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>PRICE</td>
        <td>FORAGE</td>
    </tr>
    <c:forEach items="${temp}" var = "d"><tr>
    <td>${d.id}</td>
    <td>${d.name}</td>
    <td>${d.price}</td>
    <td>${d.foeage}</td>
</tr></c:forEach></table>
</html>
