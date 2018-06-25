<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/6/21
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<p>
    ${msg}
</p>

<form action="/loginServlet" style="position: relative;margin: 0 auto;text-align: center">

    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
