package com.carryman.oop.advance.extend;

import java.io.PrintStream;

public class test {
    public static void main(String[] args) {


//        Person person = new Person("凡人", 1);
//        String say = person.say();
//        System.out.println(say);
        Person person = new Student("小米", 18, 10010, 100);

        Student student = new Student("小米2", 18, 10010, 100);


 //       Person person1= new Person("转型父亲", 100);

        /*向上转型测试*/
        //重写后的
        System.out.println(person.say());
        System.out.println();
        // 重写后的
        System.out.println(student.say());



        student.goToSchool();//本类可以调用 子类特有方法
        //person.goToSchool();//向上转型 后不可调用子类特有成员

        /*向下转型测试*/

//       Student student1= (Student)person;
//        String s = student1.goToSchool();
//        System.out.println(s);


//        Student student2= (Student)person1;
//        String s1 = student2.goToSchool();
//        System.out.println(s1);



    }

}
