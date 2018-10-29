package com.flexible.ioc.tradition;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 17:36
 */
public class Lisi implements Worker {
    @Override
    public void doWork(String information) {
        System.out.println(information);
    }
}
