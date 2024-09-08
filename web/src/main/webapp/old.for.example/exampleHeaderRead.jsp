<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.08.2024
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="height: 100%">
<%! String text = "olololo"; %>
<% String header = request.getHeader("accept"); %>

<h3>accept: <%= header%></h3>
<h4>test: <%= text%></h4>
<div style="display: flex;min-height: 100%;">

</div>
<%@include file="exampleFooter.jsp"%>
</body>
</html>
