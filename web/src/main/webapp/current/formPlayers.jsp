<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1><%=request.getAttribute("type")%> a player </h1>


<form action="${pageContext.request.contextPath}<%=request.getAttribute("url")%>" method="post">
    Player:<input name="name" type="text" value="<%=request.getAttribute("name")%>"><br/>
    Age:<input name="age" type="number" value="<%=request.getAttribute("age")%>"><br/>
    Country:<input name="country" type="text" value="<%=request.getAttribute("country")%>"><br/>
    Position:<input name="role" type="text" value="<%=request.getAttribute("role")%>"><br/>
    <input value="<%=request.getAttribute("type")%> player" type="submit">
</form>


</body>
</html>

