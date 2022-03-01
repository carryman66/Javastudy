package com.carryman.oop.advance.abstract_;

public class ComEmp extends Emp{
    public ComEmp(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void work() {
        System.out.println("普通员工"+getName()+"正在工作");
    }
}
