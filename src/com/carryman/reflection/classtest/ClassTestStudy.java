package com.carryman.reflection.classtest;


import com.carryman.io_.pojo.Dog;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * @author FFur
 * @version 1.0
 */
public class ClassTestStudy {
   @Test
    public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
       String classAllPath="com.carryman.reflection.Dog";
       Class<?> cls = Class.forName(classAllPath);
       System.out.println(cls);
       System.out.println(cls.getClass());
       //得到包名
       System.out.println(cls.getPackage().getName());
       //得到全类名
       System.out.println(cls.getName());
       //得到实例
       Class<?> aClass = Class.forName("com.carryman.io_.pojo.Dog");
       Dog o =(Dog) aClass.newInstance();
       System.out.println(o);
       //这里是私有的字段，就会报错
       //获得属性
       //Field name = aClass.getField("name");
       //得到字段的值
       //System.out.println(name.get(o));
       //通过反射给字段赋值
       //name.set(o,"金毛");
       //没有public的字段，就不会获取
//       Field[] fields = aClass.getFields();
//       for (Field field : fields) {
//           System.out.println(field.getName());
//       }

   }
}
