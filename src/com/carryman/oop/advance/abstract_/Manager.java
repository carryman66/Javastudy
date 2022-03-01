package com.carryman.oop.advance.abstract_;

public class Manager extends Emp{
    private double bouns;

    public Manager(String name, int id, double salary, double bouns) {
        super(name, id, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    void work() {
        System.out.println("经理"+getName()+"正在工作");
    }
}
