package com.carryman.oop.practice;



/*第四题*/
public class Base {
    private String name;
    private double perDiem;
    private int workDays;


    public Base(String name, double perDiem, int workDays) {
        this.name = name;
        this.perDiem = perDiem;
        this.workDays = workDays;
    }

    public void printSalary(){
        System.out.println("我是base");
        System.out.println("总薪水:"+perDiem*workDays);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerDiem() {
        return perDiem;
    }

    public void setPerDiem(double perDiem) {
        this.perDiem = perDiem;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}

class Manager extends Base{
    private double grade;

    public Manager(String name, double perDiem, int workDays, double grade) {
        super(name, perDiem, workDays);
        this.grade = grade;
    }

    @Override
    public void printSalary() {
        super.printSalary();

        System.out.println("我是manager,baba的名字"+super.getName());
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}


class c extends Manager{
    public c(String name, double perDiem, int workDays, double grade) {
        super(name, perDiem, workDays, grade);
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("我是c的重写方法");
    }
}
class test{
    public static void main(String[] args) {
        Base baba = new Base("baba", 19, 10);
        Manager erzi = new Manager("儿子", 13, 45, 1);

        c c = new c("C", 12, 43, 1);
        c.printSalary();


    }
}