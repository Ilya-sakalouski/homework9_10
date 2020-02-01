<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add user page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addUsers" method="post">
    Username:<label>
    <input name="username" type="text" minlength="1" maxlength="40" required>
</label><br>
    Password:<label>
    <input name="password" type="password" minlength="1" maxlength="40" required>
</label><br>
    Is active:<label>
    <select v-model="selected">
        <option disabled value="">choose value</option>
        <option>true</option>
        <option>false</option>
    </select></label><br>
    Age:<label>
    <input name="age" type="number" min="1" max="120" required>
</label><br>
    Address:<label>
    <input name="address" type="text" maxlength="100" required>
</label><br>
    Telephone in Belarus format: +375(__)_______:<label>
    <input name="telephone" type="tel"
           pattern="\s{0,}\+{1,1}375\s{0,}\({0,1}(([2]{1}([5]{1}|[9]{1}))|([3]{1}[3]{1})|([4]{1}[4]{1}))\)\s{0,}[0-9]{3,3}\s{0,}[0-9]{4,4}"
           maxlength="15" required>
</label> <br>
    <input type="submit" value="Add">
</form>
</body>
</html>
