package cn.xuyangl.servlet;

import cn.xuyangl.pojo.User;
import cn.xuyangl.service.LoginService;
import cn.xuyangl.service.UserService;
import cn.xuyangl.service.impl.LoginServiceImpl;
import cn.xuyangl.service.impl.UserServiceImpl;
import com.sun.deploy.net.proxy.pac.PACFunctions;

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
 * @Date: 2018/6/23 10:26
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet{

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repassword = req.getParameter("repassword");

        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        String email = req.getParameter("email");
        //判断两次输入的密码是否相等
        if (password!=null&&repassword!=null&&password.equals(repassword))
        {
            User user = new User();
            user.setName(username);
            user.setSex(sex);
            user.setPassword(password);
            user.setEmail(email);
            userService.addUser(user);
            req.setAttribute("msg","注册成功");
        }else{
            req.setAttribute("msg","两次输入的密码不一致");
        }
    }
}
