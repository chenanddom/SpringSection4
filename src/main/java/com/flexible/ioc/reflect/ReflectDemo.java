package com.flexible.ioc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
//        获取所有得属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field:declaredFields) {
            //将私有属性设置为可以操作，而不需要通过类得方法操作属性。
            field.setAccessible(true);
            System.out.println(field.getName());
            if (field.getName()=="userName"){
                field.set(person,"test1");
            }else if (field.getName()=="userAge"){
                field.set(person,28);
            }
        }
        System.out.println(person.toString());
    }
}
