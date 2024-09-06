<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/players/add" method="post">
    Player:<input name="name" type="text" value="<%=request.getAttribute("name")%>" ><br/>
    Age:<input name="age" type="number" value="<%=request.getAttribute("age")%>" ><br/>
    Country:<input name="country" type="text" value="<%=request.getAttribute("country")%>" ><br/>
    Position:<input name="role" type="text" value="<%=request.getAttribute("role")%>" ><br/>
    <input name="input" type="submit" value="<%=request.getAttribute("input")%>" >

</form>

</body>
</html>

