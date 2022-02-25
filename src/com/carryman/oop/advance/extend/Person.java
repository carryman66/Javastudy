package com.carryman.oop.advance.extend;

public class Person {
    private String name;
    private int age;




    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person初始化完毕");
    }

    public String say(){
       return "名字："+getName()+" 年龄："+getAge();
    }

    public String did(){

        return "did gg";
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
}
