<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.08.2024
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--Если уже есть переменная, то не изменятся свойства (property)--%>
<jsp:useBean id="somePlayer" class="by.education.data.Player" scope="request">
    <jsp:setProperty name="somePlayer" property="name" value="Antonio"/>
    <jsp:setProperty name="somePlayer" property="age" value="30"/>
    <jsp:setProperty name="somePlayer" property="country" value="Kolodischi"/>
</jsp:useBean>

<%--Если есть Сеттеры, то изменится значение уэе действующей переменной--%>
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
</body>
</html>
