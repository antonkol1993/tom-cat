<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2024
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter username and Password</h1>
<form action="${pageContext.request.contextPath}/validity" method="post">
    Username: <input name="userName" type="text"> <br>
    password: <input name="password" type="password"> <br/>
    <input value="sign" type="submit"> <br/>
</form>

</body>
</html>
