<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 28.02.2024
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstPage</title>
</head>
<body>
    <h1>MyPage</h1>
    <form action="My" method="get">
        <input type="text" name="textInput">
        <input type="submit" name="Submit">
    </form>

    <%
        if(request.getAttribute("res") != null){
            for(String s: (List<String>)request.getAttribute("res")) {
                out.println(s + "<br>");
            }
        }
    %>

</body>
</html>
