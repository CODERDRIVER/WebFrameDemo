<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/6/21
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registe Page</title>
</head>
<body>

    <h2>欢迎来到注册页面</h2>

    <p>${msg}</p>

    <form action="/registerServlet" id="register-form" method="post" style="position: relative;margin: 0 auto;text-align: center">

        <label for="username">请输入用户名：</label><input type="text" name="username"><br>
        <label for="password">请输入密码：</label><input type="text" name="password"><br>
        <label for="repassword">请重新输入密码：</label><input type="text" name="repassword"><br>
        <input type="radio" name="sex" value="男">男
        <input type="radio" name="sex" value="女">女<br>
        <label for="age">年龄：</label><input type="text" name="age"><br>
        <label for="email">邮箱：</label><input type="text" name="email"><br>

    </form>
</body>
</html>
