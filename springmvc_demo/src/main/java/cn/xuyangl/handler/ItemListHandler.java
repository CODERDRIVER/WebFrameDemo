package cn.xuyangl.handler;


import cn.xuyangl.pojo.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 14:56
 */
public class ItemListHandler implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> list  = new ArrayList<>();
        User user = new User("lxy",21);
        User user1 = new User("zhangsan",20);
        User user2 = new User("lisi",22);
        list.add(user);
        list.add(user1);
        list.add(user2);
        ModelAndView modelAndView = new ModelAndView();

        //填充数据
        modelAndView.addObject("userList",list);
        //视图
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}
