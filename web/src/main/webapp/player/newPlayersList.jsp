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
        <th>Age</th>
        <th>Country</th>
        <th>Id</th>
        <th>Reference</th>
    </tr>


    <%--    <% List<Player> players = PlayerService.getInstance().getPlayerList();%>--%>

    <%--    <jsp:setProperty name="jspPlayers" property="age" value="<%= sizePlayersList %>"/>--%>
    <%--    <jsp:getProperty name="size" property="propName"/>--%>

    <t:forEach items="${list}" var="player">


<%--            <%
                    String name = player.getName();
                    Integer age = player.getAge();
                    String country = player.getCountry();
                    Integer id = player.getId();
                %>--%>
    <tr>
        <td>${player.name}<%--<%=name%>--%>
        </td>
        <td>${player.age}<%--<%=age%>--%>
        </td>
        <td>${player.country}<%--<%=country%>--%>
        </td>
        <td>${player.id}<%--<%=id%>--%>
        </td>
        <td>${player}<%--<%=player%>--%>
        </td>
        <td>
            <button type="button" name="popup-button">delete</button>
        </td>
        <td>
            <button type="button" name="popup-button">add</button>
        </td>
    </tr>

    </t:forEach>

    <jsp:useBean id="somePlayer"  class="by.education.data.Player" scope="request">
        <jsp:setProperty name="somePlayer" property="name" value="Antonio"/>
        <jsp:setProperty name="somePlayer" property="age" value="30"/>
        <jsp:setProperty name="somePlayer" property="country" value="Kolodischi"/>
    </jsp:useBean>

    <jsp:setProperty name="somePlayer" property="id" value="-11"/>
    <tr>
        <td>${somePlayer.name}<%--<%=name%>--%>
        </td>
        <td>${somePlayer.age}<%--<%=age%>--%>
        </td>
        <td>${somePlayer.country}<%--<%=country%>--%>
        </td>
        <td>${somePlayer.id}<%--<%=id%>--%>
        </td>
        <td>${somePlayer}<%--<%=player%>--%>
        </td>
        <td>
            <button type="button" name="popup-button">delete</button>
        </td>
        <td>
            <button type="button" name="popup-button">add</button>
        </td>
    </tr>
    <a href="<t:url value="/player/enterPlayer.jsp"/>"> add_player</a>
</table>
</body>
</html>
