<%@ page import="java.util.List" %>
<%@ page import="by.education.data.Player" %>
<%@ page import="by.education.service.PlayerService" %>
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
    <title>out players to browser</title>
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

        <% int i = 0; %>
        <% List<Player> players = PlayerService.getInstance().getList();%>
    <%--    <jsp:useBean id="jspPlayers" class="by.education.data.Player" />--%>
    <%--    <jsp:setProperty name="jspPlayers" property="age" value="<%= sizePlayersList %>"/>--%>
    <%--    <jsp:getProperty name="size" property="propName"/>--%>

    <t:forEach items="${list}" var="player">


            <%
                    Player player = players.get(i);
                    String name = player.getName();
                    Integer age = player.getAge();
                    String country = player.getCountry();
                    Integer id = player.getId();
                %>
    <tr>
        <td><%=name%>
        </td>
        <td><%=age%>
        </td>
        <td><%=country%>
        </td>
        <td><%=id%>
        </td>
        <td><%=player%>
        </td>
        <% i++; %>
    </tr>
    </t:forEach>


    <%--<html>--%>

    <%--<body>--%>
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
    <%--</table>--%>

</body>
</html>
