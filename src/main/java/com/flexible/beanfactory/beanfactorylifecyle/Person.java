package com.flexible.beanfactory.beanfactorylifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-07
 * Time: 13:49
 */
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String userName;
    private Integer userAge;
    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("调用了Person()的构造函数");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Person.setUserName");
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        System.out.println("Person.setUserAge");
        this.userAge = userAge;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory");
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware.setBeanName");
        this.beanName=name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet");
    }

    public void mInit(){
        System.out.println("调用了配置文件配置的init-method所指定的方法mInit()");
    }
    public void mDestroy(){
        System.out.println("调用了配置文件配置的destroy-method所指定的mDestroy()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", beanName='" + beanName + '\'' +
                '}';
    }
}
