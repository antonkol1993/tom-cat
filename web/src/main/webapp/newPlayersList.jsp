<%@ page import="java.util.List" %>
<%@ page import="by.education.data.Player" %>
<%@ page import="by.education.service.PlayerService" %>
<%@ page import="static org.apache.taglibs.standard.tag.common.core.OutSupport.out" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.08.2024
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>

    <% int i = 0; %>

    <% List<Player> players = PlayerService.getInstance().getList();%>
    <% Integer sizePlayersList = PlayerService.getInstance().getList().size();%>
<%--    <jsp:useBean id="size" />--%>
<%--    <jsp:setProperty name="size"--%>
<%--                     property="propName"--%>
<%--                     value="<%= sizePlayersList %>"/>--%>
<%--    <jsp:getProperty name="size" property="propName"/>--%>

    <t:forEach var="i" begin="0" end="7">
        <li>
            <%
                Player player = players.get(i);
                String name = player.getName();
                Integer age = player.getAge();
                String country = player.getCountry();
                Integer id = player.getId();
            %>
            <%=name+ ","%> <%="," +age%> <%=", " +country%> <%=", " + id%>

        </li>
        <% i ++; %>
    </t:forEach>
</ul>
</body>
</html>
