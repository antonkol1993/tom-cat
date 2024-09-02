<%@ page import="java.util.List" %>
<%@ page import="by.education.data.Player" %>
<%@ page import="by.education.service.PlayerService" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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

        .add_submit {
            width: 250px;
            height: 40px;
            background: burlywood;
            font-size: large;
            font-weight: bold;
        }

        .delete_submit {
            background: aquamarine;
            font-weight: bold;
        }

        .edit_submit {
            background: darkseagreen;
            font-weight: bold;
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
            <td><a href="<t:url value="/newPlayers/${player.id}"/>"> ${player.name}</a>
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


                    <%--                <form action="newPlayerRead" method="post">--%>


                    <%--                <form action="../taking" method="post">--%>
                    <%--                    <input type="hidden" name="delete" value="${player.id}"/>--%>
                    <%--                    <input value="Delete" type="submit" class="delete_submit">--%>
                    <%--                </form>--%>
                    <%--                <form action="${pageContext.request.contextPath}/taking" method="post">--%>
                    <%--                    <input type="hidden" name="id" value="${player.id}"/>--%>
                    <%--                    <input value="Edit" type="submit" class="edit_submit">--%>
                    <%--                </form>--%>
                                            <form action="${pageContext.request.contextPath}/players/delete/${player.id}" method="post">
                                                <input value="new delete" type="submit" class="edit_submit">
                                            </form>


                    <%--                <form action="../newPlayerRead" method="post"></form>--%>
            </td>
                <%--            <td>--%>
                <%--                <button type="button" name="popup-button">add</button>--%>
                <%--            </td>--%>
        </tr>

    </t:forEach>

    <%--    <form action="${pageContext.request.contextPath}/taking" method="post">--%>
    <%--        <input type="hidden" name="add" value="add"/>--%>
    <%--        <input value="Add" type="submit" class="add_submit" >--%>
    <%--    </form>--%>

    <%--        <a href="<t:url value="/player/addPlayer.jsp"/>"> add_player</a>--%>

</table>
</body>
</html>
