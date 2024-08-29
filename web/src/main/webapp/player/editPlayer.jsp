<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter to edit a player </h1>

<form action="../taking" method="post">
    Player:<input name="name" type="text"><br/>
    Age:<input name="age" type="number"><br/>
    Country:<input name="country" type="text"><br/>
    <input name="add" type="hidden" value="edit">
    <input value="add" type="submit">
</form>


</body>
</html>

