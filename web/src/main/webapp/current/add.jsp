<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.09.2024
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter to create player</h1>
<jsp:include page="formPlayers.jsp">
    <jsp:param name="input" value="" />
    <jsp:param name="name" value=""/>
    <jsp:param name="age" value=""/>
    <jsp:param name="country" value=""/>
    <jsp:param name="role" value=""/>
</jsp:include>


</body>
</html>
