<form action="${pageContext.request.contextPath}<%=request.getAttribute("servletPath")%>" method="post">
    Username:<input name="username" type="text" value="<%=request.getAttribute("username")%>"><br/>
    Password:<input name="password" type="text" value="<%=request.getAttribute("password")%>"><br/>
    <input type="hidden" value="<%=request.getAttribute("id")%>" name="id">
    <input name="input" type="submit" value="<%=request.getAttribute("input")%>">
</form>

