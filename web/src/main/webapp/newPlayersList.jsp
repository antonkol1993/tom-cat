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

<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>
    <tr>
        <th>Player</th>
        <th>age</th>
        <th>country</th>
        <th>ID</th>
        <th>reference</th>
    </tr>
<html>

<body>
<%--<ul>--%>

<%--    <% int i = 0; %>--%>

<%--    <% List<Player> players = PlayerService.getInstance().getList();%>--%>
<%--    <% Integer sizePlayersList = PlayerService.getInstance().getList().size();%>--%>
<%--&lt;%&ndash;    <jsp:useBean id="jspPlayers" class="by.education.data.Player" />&ndash;%&gt;--%>
<%--&lt;%&ndash;    <jsp:setProperty name="jspPlayers" property="age" value="<%= sizePlayersList %>"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <jsp:getProperty name="size" property="propName"/>&ndash;%&gt;--%>

<%--    <h2>name age country id Player</h2>--%>
<%--    <t:forEach items="${list}" var="player">--%>
<%--        <li>--%>

<%--            <%--%>
<%--                Player player = players.get(i);--%>
<%--                String name = player.getName();--%>
<%--                Integer age = player.getAge();--%>
<%--                String country = player.getCountry();--%>
<%--                Integer id = player.getId();--%>
<%--            %>--%>
<%--            <%=name+ ","%> <%="," +age%> <%=", " +country%> <%=", " + id%> <%=", " + player%>--%>
<%--        </li>--%>
<%--        <% i ++; %>--%>
<%--    </t:forEach>--%>
<%--</ul>--%>
</table>

</body>
</html>
