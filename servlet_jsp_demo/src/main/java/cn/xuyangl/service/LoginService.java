package cn.xuyangl.service;

/**
 * @Description 登录接口
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/21 17:27
 */
public interface LoginService {

    //用户名密码登录
    public boolean login(String name,String password);
}
