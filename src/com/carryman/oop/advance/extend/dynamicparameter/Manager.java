package com.carryman.oop.advance.extend.dynamicparameter;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double monthlySalary, double bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String manager(){
        return "经理"+getName()+"正在管理公司……";

    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+getBonus();
    }
}
