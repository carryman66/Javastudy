package com.carryman.oop.practice;

/**
 * 1题
 */
public class Person {
    private String name;
    private int age;
    private int job;

    public Person(String name, int age, int job) {
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

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }
}
