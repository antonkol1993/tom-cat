<%@ page import="by.education.service.PersonService" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.09.2024
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="personList" scope="request" type="java.util.List"/>
<t:forEach items="${personList}" var="person">
    <tr>
        <td>${person.userName}</td>
        <td>${person.password}</td>
        <td>${person.userRole}</td>
    </tr>
</t:forEach>

</body>
</html>
