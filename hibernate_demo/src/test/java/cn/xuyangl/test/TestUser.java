package cn.xuyangl.test;

import cn.xuyangl.domain.User;
import cn.xuyangl.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 10:07
 */
public class TestUser {



    public static void main(String[] args) {
        // 实例化Configuration，
        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure("hibernate.cfg.xml");
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例
        User user = new User();
        // 设置消息标题和消息内容
        user.setName("zhagnsan");
        user.setEmail("zhangsan@qq.com");
        user.setAge(22);
        // 保存消息
        sess.save(user);
        // 提交事务
        tx.commit();
        System.out.println("success");
        // 关闭Session
        sess.close();
        sf.close();
    }

    @Test
    public void testFind()
    {
            SessionFactory sessionFactory = SessionUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            String hql = "from User where id = ?";
             Query query = session.createQuery(hql);
        query.setInteger(0,1);
        User result = (User)query.uniqueResult();

        System.out.println(result.getName()+" "+result.getEmail());
    }
}
