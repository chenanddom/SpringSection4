package com.flexible.beanfactory.beanfactorylifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       if ("person".equals(beanName)){
           Person p = (Person)bean;
           p.setBeanName("张三");
           p.setUserAge(28);
        System.out.println(p.toString());
       }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            Person p = (Person)bean;
            p.setBeanName("张三");
            p.setUserAge(30);
            System.out.println(p.toString());
        }
        return bean;
    }
}
