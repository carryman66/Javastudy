package com.carryman.oop.advance.extend.dynamicparameter;

public class Worker extends Employee{
    public Worker(String name, double monthlySalary) {
        super(name, monthlySalary);
    }


    public String work(){
        return "工人"+getName()+"正在工作……";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
