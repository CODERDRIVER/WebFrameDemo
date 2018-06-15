<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/6/13
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>UserList demo</title>
</head>
<body>

    ${userList.get(0).name}<br>
    用户列表：
    <table width="100%" border="1">
        <tr>
            <td>用户名</td>
            <td>用户年龄</td>
        </tr>
        <c:forEach items="${userList}" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.age}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
