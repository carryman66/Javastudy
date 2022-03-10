package com.carryman.collection_.work;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author carry man
 * @version 1.0
 */
public class Work04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person person1 = new Person("小米", 12, "经理1");
        Person person2 = new Person("小明", 19, "经理2");
        Person person3 = new Person("小米", 12, "员工3");
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        for (Object person : hashSet) {
            Person p=(Person) person;
            System.out.println(p);
        }


    }
}

class Person{
    private String name;
    private  int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
