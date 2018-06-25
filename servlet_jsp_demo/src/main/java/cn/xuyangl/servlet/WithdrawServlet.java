package cn.xuyangl.servlet;

import cn.xuyangl.pojo.User;
import cn.xuyangl.service.AccountService;
import cn.xuyangl.service.impl.AccountServiceImpl;

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
 * @Date: 2018/6/24 23:42
 */
@WebServlet("/withdrawServlet")
public class WithdrawServlet extends HttpServlet{

    private AccountService accountService = new AccountServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        double account = Double.parseDouble(req.getParameter("account"));
        boolean withdraw = accountService.withdraw(username, account);
        //设置相应编码
        resp.setCharacterEncoding("utf-8");
        //告知客户端用何种编码
        resp.setContentType("text/html;charset=UTF-8");
        if (withdraw)
        {
            resp.getWriter().println("取款成功");
        }else{
            resp.getWriter().println("取款失败");
        }
    }
}
