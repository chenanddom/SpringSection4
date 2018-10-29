package com.flexible.ioc.tradition;

import com.flexible.ioc.tradition.Worker;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 17:14
 */
public class Boss {
    public static void main(String[] args) {
        //老板亲自上阵喊工人干活
        Worker zhangsan = new Zhangsan();
        zhangsan.doWork("搬砖");
        Worker lisi = new Lisi();
        lisi.doWork("砌墙");
    }
}
