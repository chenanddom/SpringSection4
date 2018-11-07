package com.flexible.beanfactory.beanfactorylifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    //接口方法：在实例化Bean前调用
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
        }
        return null;
    }
    //接口方法：在实例化Bean后调用

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        }
        return true;
    }

    //接口方法：在设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues");
        }
        return pvs;
    }
}
