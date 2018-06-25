package cn.xuyangl.test;

import cn.xuyangl.service.UserService;
import cn.xuyangl.service.impl.UserServiceImpl;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/21 17:18
 */
public class UserTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        double balance =  userService.getBalance("lxy");
        System.out.println(balance);
    }
}
