package cn.xuyangl.test;

import cn.xuyangl.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 08:36
 */
public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");

        System.out.println(user.getMsg()+","+user.getName());
        System.out.println(user==user1);

    }
}
