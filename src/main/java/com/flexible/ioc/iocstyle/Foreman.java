package com.flexible.ioc.iocstyle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-10-29
 * Time: 17:42
 */
public class Foreman implements ActorArrangable,ApplicationListener {
private Worker worker;
    @Override
    public void setWorker(Worker worker) {
        this.worker=worker;
    }
    public void arrangeWork(String workType){
        worker.doWork(workType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("----------------------"+applicationEvent.toString());
    }
}
