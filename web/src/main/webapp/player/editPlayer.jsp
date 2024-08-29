<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter to edit a player </h1>

<c: items="id" var="id"></c:>
<form action="edit" method="post">
    Player:<input name="name" type="text"><br/>
    Age:<input name="age" type="number"><br/>
    Country:<input name="country" type="text"><br/>
    <input name="edit" type="hidden" value="${id}">
    <input value="edit player" type="submit">
</form>


</body>
</html>

