package com.carryman.reflection.work;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FFur
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------------------");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Object o = declaredConstructor.newInstance("d:\\aa.txt");

        Method createNewFile = aClass.getMethod("createNewFile");
        createNewFile.invoke(o);
    }
}
