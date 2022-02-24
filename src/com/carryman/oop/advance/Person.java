package com.carryman.oop.advance;

public class Person {
    public String name;
    private double sal;
    private int age;

    public Person() {
        System.out.println("w shi person 的无参构造");
    }

    public Person(String name, double sal, int age) {
       setName(name);
       setSal(sal);
       setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=6){
            this.name = name;
        }else {
            this.name ="默认";
        }

    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", age=" + age +
                '}';
    }
}
