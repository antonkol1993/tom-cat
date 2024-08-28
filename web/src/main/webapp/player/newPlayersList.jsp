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


    <t:forEach items="${list}" var="player">

        <tr>
            <td>${player.name}
            </td>
            <td>${player.age}
            </td>
            <td>${player.country}
            </td>
            <td>${player.id}
            </td>
            <td>${player}
            </td>
            <td>


                <form action="../newPlayerRead" method="post">
                    <button type="button" name="delete" value="${player.id}"
                    >delete</button>

                </form>
                        <%--                <form action="../newPlayerRead" method="post"></form>--%>
            </td>
                <%--            <td>--%>
                <%--                <button type="button" name="popup-button">add</button>--%>
                <%--            </td>--%>
        </tr>

    </t:forEach>
    <a href="<t:url value="/player/enterPlayer.jsp"/>"> add_player</a>
</table>
</body>
</html>
