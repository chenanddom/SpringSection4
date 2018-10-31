package com.flexible.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��װ������ȡCar�����
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.flexible.ioc.reflect.Person");
        //��ȡ���Ĭ�Ϲ�����������ͨ����ʵ����
//        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Person person = (Person) constructor.newInstance();
        //ͨ�����䷽����������
        Method setUserName = clazz.getMethod("setUserName", String.class);
        setUserName.invoke(person, "zhangsan");
        Method setUserAge = clazz.getMethod("setUserAge", Integer.class);
        setUserAge.invoke(person, 26);
        System.out.println(person.toString());
//        System.out.println(setUserAge.getReturnType());//��ȡ����ֵ����
//        System.out.println(setUserAge.getParameterTypes());//��ȡ��������
        System.out.println(setUserAge.getParameterAnnotations());
        System.out.println(loader);
        System.out.println(loader.getParent());
        //������������ClassLoader�����࣬��C++д�ģ��޷���ȡ��
        System.out.println(loader.getParent().getParent());
            

    }
}
