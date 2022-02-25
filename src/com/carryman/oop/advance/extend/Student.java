package com.carryman.oop.advance.extend;

public class Student extends Person{
    private int id;
    private int score;



    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"id： "+getId()+" 成绩： "+getScore();
    }
    public String goToSchool(){
        return "去上学";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
