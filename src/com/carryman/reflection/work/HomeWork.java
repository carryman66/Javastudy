package com.carryman.reflection.work;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FFur
 * @version 1.0
 */
public class HomeWork {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.carryman.reflection.work.PrivateTest");
        //得到PrivateTest实例
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"ffur");
        System.out.println(name.get(o));

        Method getName = aClass.getDeclaredMethod("getName");
        Object invoke = getName.invoke(o);
        System.out.println(invoke);

    }
}
class PrivateTest{
    private String name = "hellokitty";
    public String getName(){
        return name;
    }
}
