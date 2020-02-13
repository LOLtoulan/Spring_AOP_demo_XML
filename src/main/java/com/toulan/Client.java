package com.toulan;

import com.toulan.service.AccountService;
import com.toulan.service.impl.AccountServiceImpl;
import com.toulan.utils.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author LOL_toulan
 * @Time 2020/2/12 15:56
 * @Message
 */
public class Client {

    /*public static void main(String[] args) {

        AccountServiceImpl service = new AccountServiceImpl();
        Logger logger = new Logger();


        AccountService accountService = (AccountService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //提供增强代码
                Object returnValue = null;
                logger.printLog();
                //获取方法的执行参数
                //判断当前方法是不是销售
                returnValue =  method.invoke(service, args);
                return returnValue;
            }
        });

        accountService.saveAccount();
        accountService.updateAccount();
        accountService.deleteAccount();
    }*/

}
