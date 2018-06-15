package cn.xuyangl.aop;

import org.aspectj.lang.JoinPoint;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/13 08:53
 */
public class LogAop {

    public void before(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println("开始执行:"+className+"."+methodName+"()方法...");
    }
    public void afterThrowing(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法抛出了异常...");
    }
    public void afterReturn(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法正常执行结束...");
    }
    public void after(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()最终执行步骤(finally)...");
    }
    /*//用来做环绕通知的方法可以第一个参数定义为org.aspectj.lang.ProceedingJoinPoint类型
    public Object doAround(ProceedingJoinPoint call) throws Throwable {
        Object result = null;
        this.before(call);//相当于前置通知
        try {
            result = call.proceed();
            this.afterReturn(call); //相当于后置通知
        } catch (Throwable e) {
            this.afterThrowing(call); //相当于异常抛出后通知
            throw e;
        }finally{
            this.after(call);  //相当于最终通知
        }
        return result;
    }*/
}
