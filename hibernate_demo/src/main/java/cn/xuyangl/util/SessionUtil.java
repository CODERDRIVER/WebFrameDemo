package cn.xuyangl.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 23:18
 */
public class SessionUtil {

    public static SessionFactory getSessionFactory()
    {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
