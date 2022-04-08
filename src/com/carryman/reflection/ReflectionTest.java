package com.carryman.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FFur
 * @version 1.0
 */
public class ReflectionTest {
    @Test
    public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //得到类对象
        Class dog = Class.forName("com.carryman.reflection.Dog");
        //创建实例
        Object o = dog.newInstance();

        //类对象，调用方法
        Method hi = dog.getMethod("hi");
        //取消检查
        hi.setAccessible(true);
        hi.invoke(o);

        //访问字段
        //不能得到私有的属性
        Field name = dog.getField("name");
        System.out.println(name.get(o));

        //得到无参构造
        Constructor<?> constructor = dog.getConstructor();
        System.out.println(constructor);
        //得到有参构造

        Constructor<?> constructor1 = dog.getConstructor(int.class);
        System.out.println(constructor1);
    }

    @Test
    public  void test2(){

    }
}
class Dog{
    public String name;
    private int age;
    public Dog() {
        this.name="金毛";
    }

    public Dog(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hi(){
        System.out.println("dog说hi");
    }

}