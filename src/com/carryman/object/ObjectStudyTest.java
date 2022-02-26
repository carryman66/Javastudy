package com.carryman.object;

public class ObjectStudyTest {
    public static void main(String[] args) {
        Person person1 = new Person("小米",18,1001);
        Person person2 = new Person("小米",18,10011);

        //判断属性相同的两个人一样吗
        //因为没有重写所以默认判断的是地址，两个对象的地址不一样所以fasle

        //重写了Person的equals
        //判断值是否相等
        boolean equals = person1.equals(person2);
        System.out.println(equals);


    }
}
