package cn.xuyangl.dao;

import cn.xuyangl.pojo.User;
import cn.xuyangl.utils.DBUtils;
import com.sun.org.apache.bcel.internal.generic.FADD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 19:32
 */
public class UserDao {


    public List<User> findAll()  {
        Connection connection = null;
        String sql = "SELECT * FROM USER";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList<User>();

        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            //获得数据
            while (resultSet.next())
            {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setAge(resultSet.getInt(3));
                user.setEmail(resultSet.getString(4));
                user.setSex(resultSet.getInt(5)==0?"男":"女");
                list.add(user);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addUser(User user)
    {
        Connection connection = null;
        String sql = "insert into USER(name,age,email,sex) values(?,?,?,?)";
        PreparedStatement preparedStatement = null;
//        connection.setAutoCommit(false);      设置事务

        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setInt(2,user.getAge());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setInt(4,user.getSex().equals("男")?1:0);
            preparedStatement.execute();
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
