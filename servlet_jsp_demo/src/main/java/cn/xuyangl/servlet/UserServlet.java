package cn.xuyangl.servlet;

import cn.xuyangl.pojo.User;
import cn.xuyangl.service.UserService;
import cn.xuyangl.service.impl.UserServiceImpl;
import com.sun.net.httpserver.HttpServer;
import sun.net.httpserver.HttpServerImpl;

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
 * @Date: 2018/6/12 19:43
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("enter in");
        List<User> user = userService.findAll();
        req.setAttribute("users",user);
        req.getRequestDispatcher("./Userinfo.jsp").forward(req,resp);
//        resp.sendRedirect("./Userinfo.jsp");
    }
}
