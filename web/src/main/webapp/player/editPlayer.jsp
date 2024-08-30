<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Enter to edit a player </h1>

<%--<c: items="id" var="id"></c:>--%>
<jsp:useBean id="currentPlayer" class="by.education.data.Player">
    <jsp:setProperty name="currentPlayer" property="age" value="18"/>
</jsp:useBean>
<jsp:include page="playerEditForm.jsp" >
    <jsp:param name="action" value="edit" />
    <jsp:param name="age" value="${currentPlayer.age}" />
</jsp:include>
<%--<form action="edit" method="post">--%>
<%--    Player:<input name="name" type="text" value="${currentPlayer.name}"> <br/>--%>
<%--    Age:<input name="age" type="number"><br/>--%>
<%--    Country:<input name="country" type="text"><br/>--%>
<%--    <input name="edit" type="hidden" value="${id}">--%>
<%--    <input value="edit player" type="submit">--%>
<%--</form>--%>


</body>
</html>

