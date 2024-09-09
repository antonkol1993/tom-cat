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

        .add_href {
            font-weight: bold;
            font-size: large;
        }
    </style>
    <title>Players list</title>
</head>
<body>

<jsp:include page="signOutForm.jsp"/>

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
            <td><a href="<t:url value="../new/players/${player.id}"/>"> ${player.name}</a>
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
                <form action="/web/new/players/edit/${player.id}" method="get">
                    <input value="Edit" type="submit" class="edit_submit">
                </form>

                <form action="/web/new/players/delete/${player.id}" method="post">
                    <input value="Delete" type="submit" class="edit_submit">
                </form>
            </td>
        </tr>

    </t:forEach>
    <a class="add_href" style="color: darkred" href="${pageContext.request.contextPath}/players/add">Add a new
        player</a>


</table>
</body>
</html>
