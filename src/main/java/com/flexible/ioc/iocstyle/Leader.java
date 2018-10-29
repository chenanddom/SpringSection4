package com.flexible.ioc.iocstyle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 18:09
 */
public class Leader {
    @Test
    public void assignmentTasks(){
        Worker worker = new Zhangsan();
        Foreman foreman = new Foreman();
        foreman.setWorker(worker);
        foreman.arrangeWork("搬砖");
    }
    @Test
    public void testMethod(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("iocdemo.xml");
        Foreman foreman = (Foreman) ac.getBean("foreman");
        foreman.arrangeWork("搬砖");
    }


}
