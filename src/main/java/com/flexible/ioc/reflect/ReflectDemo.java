package com.flexible.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.flexible.ioc.reflect.Person");
        //获取类的默认构造器对象并且通过它实例化
//        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Person person = (Person) constructor.newInstance();
        //通过反射方法设置属性
        Method setUserName = clazz.getMethod("setUserName", String.class);
        setUserName.invoke(person, "zhangsan");
        Method setUserAge = clazz.getMethod("setUserAge", Integer.class);
        setUserAge.invoke(person, 26);
        System.out.println(person.toString());
//        System.out.println(setUserAge.getReturnType());//获取返回值类型
//        System.out.println(setUserAge.getParameterTypes());//获取参数类型
        System.out.println(setUserAge.getParameterAnnotations());
        System.out.println(loader);
        System.out.println(loader.getParent());
        //根记载器不是ClassLoader的子类，是C++写的，无法获取到
        System.out.println(loader.getParent().getParent());
            

    }
}
