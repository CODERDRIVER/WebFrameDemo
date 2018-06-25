package cn.xuyangl.test;

import cn.xuyangl.service.LoginService;
import cn.xuyangl.service.impl.LoginServiceImpl;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/21 17:30
 */
public class LoginTest {


    public static void main(String[] args) {
        LoginService loginService = new LoginServiceImpl();
        System.out.println(loginService.login("lxy","lxy"));
    }
}
