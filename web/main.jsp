<%--
  Created by IntelliJ IDEA.
  User: Skori
  Date: 13.11.2017
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Sessoin</title>
</head>
<body>
    <table border="1" width="100%" cellpadding="5">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Phone Number</th>
            <th>E-Mail</th>
        </tr>
        <c:forEach var="user" items="${users}" >
            <tr>
                <td>${user.name}</td>
                <td>${user.surname}</td>
                <td>${user.phoneNumber}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
