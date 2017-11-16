<%--
  Created by IntelliJ IDEA.
  User: Skori
  Date: 13.11.2017
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Sessoin</title>
</head>
<body>


<c:if test="${!requestScope.users.isEmpty()}">
    <table border="1" width="60%" cellpadding="5">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Phone Number</th>
            <th>E-Mail</th>
        </tr>
        <c:forEach var="user" items="${requestScope.users}" >
                <tr>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.surname}"/></td>
                    <td><c:out value="${user.phoneNumber}"/></td>
                    <td><c:out value="${user.email}"/></td>
                </tr>
        </c:forEach>
    </table>
</c:if>

<c:if test="${requestScope.users.isEmpty()}">
    <c:out value="User is not in database"/>
</c:if>
</body>
</html>
