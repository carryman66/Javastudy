package com.carryman.object;

public class Person {
    private String name;
    private  int age;
    private double id;

    public Person(String name, int age, double id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }


    public boolean equals(Object object){
        //如果是同一个对象地址就返回真
        if (this==object){
            return true;
        }
        //如果是Person的子类就向上转型，得到该对象的值
        if (object instanceof Person){
            Person person=(Person) object;
            return this.name.equals(person.name) && this.age == person.age && this.id == person.id;
        }

        return false;
    }

}
