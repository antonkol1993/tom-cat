<form action="${param.action}" method="post">
    <p>${param.currentPlayer}</p>
    Player:<input name="name" type="text" value="${param.name}"> <br/>
    Age:<input name="age" type="number" value="${param.age}"><br/>
    Country:<input name="country" type="text" value="${param.country}"><br/>
    <input name="edit" type="hidden" value="${param.id}">
    <input value="edit player" type="submit">
</form>