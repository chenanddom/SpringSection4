package com.flexible.ioc.iocstyle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 17:42
 */
public class Foreman implements ActorArrangable {
private Worker worker;
    @Override
    public void setWorker(Worker worker) {
        this.worker=worker;
    }
    public void arrangeWork(String workType){
        worker.doWork(workType);
    }
}
