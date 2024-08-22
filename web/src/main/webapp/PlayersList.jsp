<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.08.2024
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>

    <%--    <% List<String> days = (List<String>) request.getAttribute("days"); %>--%>
    <t:forEach items="${days2}" var="day">

    </t:forEach>
</ul>
</body>
</html>
