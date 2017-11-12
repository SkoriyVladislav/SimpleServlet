<%--
  Created by IntelliJ IDEA.
  by.epam.User: Skori
  Date: 11.11.2017
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
    <br/>

    <form action="ServletForJspElement" method="post">
        <input type="hidden" name="command" value="naming" />
        Введите имя:<br/>
        <input type="text" name="name" value="" /><br />
        Введите фамилию:<br/>
        <input type="text" name="surname" value="" /><br />
        <input type="submit" value="Отправить" /><br />
    </form>

</body>
</html>
