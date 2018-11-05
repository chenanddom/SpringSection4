package com.flexible.applicationcontext;

import com.flexible.ioc.iocstyle.Foreman;
import com.flexible.ioc.iocstyle.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用ApplicationContext获取配置文件
 */
public class ApplicationContextDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Foreman foreman = (Foreman) ctx.getBean("foreman");
        foreman.setWorker(new Worker() {
            @Override
            public void doWork(String information) {
                System.out.println("------------------------");
            }
        });

    }
}
