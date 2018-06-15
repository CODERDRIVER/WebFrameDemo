package cn.xuyangl.servlet;

import cn.xuyangl.pojo.User;
import cn.xuyangl.service.UserService;
import cn.xuyangl.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 20:50
 */
@WebServlet("/userAdd")
public class UserAddServlet extends HttpServlet{

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String email = req.getParameter("email");
        String sex = req.getParameter("sex");
        System.out.println(age);
        User user =  new User(name,Integer.parseInt(age),email,sex);
        userService.addUser(user);
        resp.getWriter().println("ok");
    }
}
