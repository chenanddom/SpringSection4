package com.flexible.beanfactory.beanfactorylifecyle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycleDemo {

    public static void main(String[] args) {
        Resource  rs = new ClassPathResource("iocdemo.xml");
        BeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);
        reader.loadBeanDefinitions(rs);
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        Person p1 = (Person)bf.getBean("person");
        System.out.println("main:"+p1.toString());
        p1.setUserAge(100);
        Person p2 = (Person)bf.getBean("person");
        System.out.println("p1==p2:"+(p1==p2));
        ((DefaultListableBeanFactory)bf).destroySingletons();

    }
}
