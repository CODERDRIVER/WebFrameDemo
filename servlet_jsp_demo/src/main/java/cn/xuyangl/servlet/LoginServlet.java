package cn.xuyangl.servlet;

import cn.xuyangl.pojo.User;
import cn.xuyangl.service.LoginService;
import cn.xuyangl.service.UserService;
import cn.xuyangl.service.impl.LoginServiceImpl;
import cn.xuyangl.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/21 17:47
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginServiceImpl();
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+" : "+password);
        if (loginService.login(username,password))
        {
            req.setAttribute("msg","登陆成功");
        }else{
            req.setAttribute("msg","用户名或密码错误");
        }
        List<User> user = userService.findAll();
        req.setAttribute("users",user);
        req.getRequestDispatcher("./Userinfo.jsp").forward(req,resp);
    }
}
