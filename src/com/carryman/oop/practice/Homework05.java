package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();

    }




}
class  A {
    private String name = "良";

    public void f1(){
        class B{
            private static final String name="明";
            public void show(){
                System.out.println(A.this.name);
            }
        }
        new B().show();

    }
}