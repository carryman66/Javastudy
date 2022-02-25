package com.carryman.oop.advance.extend.dynamicparameter;

public class test {
    public static void main(String[] args) {
        Worker worker = new Worker("小明", 2500);
        Manager manager = new Manager("东升", 10000, 10000);

        test test = new test();


        test.showEmp(worker);
        test.showEmp(manager);

        test.testWork(worker);
        test.testWork(manager);

    }


    public void showEmp(Employee employee){
        System.out.println("员工工资为"+employee.getAnnual());
    }

    public void testWork(Employee employee){
        if (employee instanceof Manager){
            System.out.println(((Manager) employee).manager());
        }else if (employee instanceof  Worker){
            System.out.println(((Worker) employee).work());
        }else {
            System.out.println("类型有误");
        }

    }

}
