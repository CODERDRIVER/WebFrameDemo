package cn.xuyangl.service.impl;

import cn.xuyangl.dao.UserDao;
import cn.xuyangl.service.LoginService;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/21 17:30
 */
public class LoginServiceImpl implements LoginService{

    private UserDao userDao = new UserDao();
    @Override
    public boolean login(String name, String password) {
        String passwordByName = userDao.findPasswordByName(name);
        if (password!=null&&password.equals(passwordByName))
        {
            return true;
        }
        return false;
    }
}
