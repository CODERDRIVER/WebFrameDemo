package cn.xuyangl.service;

import cn.xuyangl.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 19:40
 */
public interface UserService {
    public List<User> findAll() ;

    public boolean addUser(User user);
}
