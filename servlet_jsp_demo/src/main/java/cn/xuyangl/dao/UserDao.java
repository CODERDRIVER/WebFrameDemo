package cn.xuyangl.dao;

import cn.xuyangl.pojo.User;
import cn.xuyangl.utils.DBUtils;
import com.sun.org.apache.bcel.internal.generic.FADD;

import java.lang.ref.PhantomReference;
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


    /**
     * 获得该用户的余额
     *
     */
    public double getBalance(String name)
    {
        Connection connection = null;
        String sql = "select account_id from USER where name=?";
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        double result = 0;
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            int account_id = 0;
            if (resultSet.next())
            {
                account_id =  resultSet.getInt(1);
            }
            String sql1 = "select balance from ACCOUNT where id = ?";
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1,account_id);
            ResultSet rs1 = preparedStatement1.executeQuery();
            if (rs1.next()){
                result = rs1.getLong(1);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }


    /**
     * 根据用户名查询密码
     */
    public String findPasswordByName(String name)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select password from USER where name = ? ";
        String password = null;
        try{
            connection = DBUtils.getConnection();
            preparedStatement  = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                password  = resultSet.getString(1);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return password;
    }

    /**
     * 根据用户名查找账户id
     */
    public int findAccountIDByUsername(String username)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select account_id from USER where name = ?";
        int result = 0;
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                result = resultSet.getInt(1);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
