<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.08.2024
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Examples of JSTL</h2>
<h4>List of days</h4>
<ul>

    <%--    <% List<String> days = (List<String>) request.getAttribute("days"); %>--%>
    <c:forEach items="${days}" var="day">
        <c:if test="${day.length() <= 3}">
            <li>${day}</li>
        </c:if>


        <li>${day}</li>
        <li>${day}</li>
        <li>${day}</li>
        <li>${day}</li>
    </c:forEach>
</ul>


<ul>

    <%--    <% List<String> days = (List<String>) request.getAttribute("days"); %>--%>
    <c:forEach items="${days}" var="day">
        <c:choose>
            <c:when test="${day == 'Sat' || day == 'Sun'}"><li>${day} - holiday</li></c:when>
            <c:otherwise><li>${day}</li></c:otherwise>
        </c:choose>
    </c:forEach>
</ul>

<a href="<c:url value="/players"/>"> WELCOME</a>
<%--sss--%>
<%--<ul>--%>

<%--    <c:forEach items="${requestScope}" var="p">--%>
<%--        <li>${p.key} -> ${p.value}</li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>

</body>
</html>