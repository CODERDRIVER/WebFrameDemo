package cn.xuyangl.mapper;


import cn.xuyangl.pojo.User;

import java.util.List;

/**
 * @Description  接口
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 09:20
 */
public interface UserMapper {
//    public void insert(User user);

    public User findUserById(int userId);

//    public List<User> findAllUsers();
}