<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1><%=request.getAttribute("type")%> a player </h1>

<form action="${pageContext.request.contextPath}/newAdd" method="post">
    Player:<input name="name" type="text"><br/>
    Age:<input name="age" type="number"><br/>
    Country:<input name="country" type="text"><br/>
    Position:<input name="role" type="text"><br/>
    <input value="add player" type="submit">
</form>


</body>
</html>

