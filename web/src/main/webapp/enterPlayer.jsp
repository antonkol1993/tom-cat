<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>I don't like Java </h1>
<h2>How are you? </h2>
<h6>I'm okay </h6>
<form action="newPlayerRead" method="post">
    Player:<input name="player" type="text"><br/>
    Age:<input name="age" type="number"><br/>
    Country:<input name="country" type="text"><br/>
    <input type="submit"/>
</form>
<%@include file="footer.jsp"%>
</body>
</html>

