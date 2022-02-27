package com.carryman.oop.practice;

/*第三题*/
public class Teacher {
    private String name ;
    private  int age;
    private  String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println(getName()+" "+getAge()+" "+getPost()+" "+getSalary());
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Professor extends Teacher{
    private double wageScale;

    public Professor(String name, int age, String post, double salary, double wageScale) {
        super(name, age, post, salary);
        this.wageScale = wageScale;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(getWageScale());
    }

    public double getWageScale() {
        return wageScale;
    }

    public void setWageScale(double wageScale) {
        this.wageScale = wageScale;
    }
}
class associateProfessor{

}

