package cn.xuyangl.service.impl;

import cn.xuyangl.dao.UserDao;
import cn.xuyangl.pojo.User;
import cn.xuyangl.service.UserService;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 19:41
 */
public class UserServiceImpl implements UserService {

    //获得Dao对象
    private UserDao userDao = new UserDao();
    public List<User> findAll()  {
        //执行一些逻辑处理，返回结果
        return userDao.findAll();
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }



    @Override
    public double getBalance(String name) {
        return userDao.getBalance(name);
    }
}
