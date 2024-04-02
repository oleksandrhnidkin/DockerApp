<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 02.04.2024
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sum page</title>
</head>
<body>
    <h1>Sum page</h1>
    <form action="First" method="get">
        <input type="number" name="numbInput1">
        <br><br>
        <input type="number" name="numbInput2">
        <br><br>
        <%
            if(request.getAttribute("res") != null) {
                out.println("<p>" + request.getAttribute("res") + "</p>");
            }
        %>
        <input type="submit" name="Submit">
    </form>
</body>
</html>
