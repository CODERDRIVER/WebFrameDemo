package cn.xuyangl.service.impl;

import cn.xuyangl.dao.AccountDao;
import cn.xuyangl.dao.UserDao;
import cn.xuyangl.service.AccountService;
import cn.xuyangl.service.UserService;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/25 00:13
 */
public class AccountServiceImpl implements AccountService{

    private UserDao userDao = new UserDao();
    private AccountDao accountDao = new AccountDao();
    @Override
    public boolean withdraw(String username, double balance) {

        //查询该用户的余额
        double account = userDao.getBalance(username);
        //判断当前余额够不够减
        if (account<balance)
        {
            //不够
            return false;
        }else{
            //根据用户名查找账户id
            int accountIDByUsername = userDao.findAccountIDByUsername(username);
            accountDao.withdraw(accountIDByUsername,balance);
            return true;
        }
    }
}
