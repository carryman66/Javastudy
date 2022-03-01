package com.carryman.oop.advance.abstract_;

public class test {
    public static void main(String[] args) {

        Manager manager = new Manager("小张", 11, 1000, 2000);

        ComEmp emp = new ComEmp("小狗", 12, 2500);

        manager.work();
        emp.work();
        
    }
}

