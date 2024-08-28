<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter a player </h1>

<form action="../newPlayerRead" method="post">
    Player:<input name="name" type="text"><br/>
    Age:<input name="age" type="number"><br/>
    Country:<input name="country" type="text"><br/>
    <input value="add" type="submit">
</form>


</body>
</html>

