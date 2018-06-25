package cn.xuyangl.dao;

import cn.xuyangl.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/25 00:06
 */
public class AccountDao {

    /**
     * 取款
     * @param id
     * @param account
     * @return
     */
    public boolean withdraw(int id,double account)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update ACCOUNT set balance = balance - ? where id = ?";
        try{
            connection = DBUtils.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setDouble(1,account);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e)
        {

            e.printStackTrace();
            return false;
        }
    }
}
