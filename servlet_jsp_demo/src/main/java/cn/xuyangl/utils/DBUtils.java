package cn.xuyangl.utils;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 19:10
 */
public class DBUtils {

    public static String DBURL="jdbc:mysql://119.23.75.180:3306/lecture";
    public static String DBDRIVER="com.mysql.jdbc.Driver";
    public static String USERNAME = "root";
    public static String PASSWORD = "1234";

    //获得连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName(DBDRIVER);
        return DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    }

    //关闭对象
    public static  void closeAll(Closeable...objs)
    {
        for (Closeable obj:objs)
        {
            if (obj!=null)
            {
                try{
                    obj.close();
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
