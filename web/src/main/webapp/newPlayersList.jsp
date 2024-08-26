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
    <title>Players list</title>
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
        <td>
            <button type="button" name="popup-button">delete</button>
        </td>
        <% i++; %>
    </tr>

    </t:forEach>

    <a href="<t:url value="/enterPlayer.jsp"/>"> add_player</a>
</body>
</html>
