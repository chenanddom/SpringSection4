package com.flexible.ioc.iocstyle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 17:36
 */
public class Zhangsan implements Worker {

    public Zhangsan() {
    }

    @Override
    public void doWork(String information) {
        System.out.println(information);
    }

}
