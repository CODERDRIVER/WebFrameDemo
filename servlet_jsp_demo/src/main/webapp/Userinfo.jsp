<%@ page import="cn.xuyangl.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/6/12
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>UserInfo</title>
</head>
<body>
<%
    List<User> users = (List<User>)request.getAttribute("users");
%>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name </td>
        <td>Age</td>
        <td>Email</td>
        <td>Sex</td>
    </tr>

    <%for(User u : users){%>
    <tr>
        <td><%=u.getId() %></td>
        <td><%= u.getName() %></td>
        <td><%= u.getAge() %></td>
        <td><%= u.getEmail() %></td>
        <td><%= u.getSex() %></td>
    </tr>

    <%} %>
</table>

</body>
</html>
