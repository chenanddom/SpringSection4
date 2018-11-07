package com.flexible.beanfactory.beanfactorylifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    //�ӿڷ�������ʵ����Beanǰ����
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
        }
        return null;
    }
    //�ӿڷ�������ʵ����Bean�����

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        }
        return true;
    }

    //�ӿڷ�����������ĳ������ʱ����
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("person".equals(beanName)){
            System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues");
        }
        return pvs;
    }
}
