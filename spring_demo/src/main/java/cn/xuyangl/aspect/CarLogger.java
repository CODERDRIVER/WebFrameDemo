package cn.xuyangl.aspect;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 08:59
 */
public class CarLogger {

    public void beforeRun(){
        System.out.println("car is going to run");
    }

    public void afterRun(){
        System.out.println("car runned");
    }
}
