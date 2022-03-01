package com.carryman.oop.advance;

public class test {
    public static void main(String[] args) {
        A a=new  A(){
            @Override
            void test() {
                System.out.println(123);
            }


        };

        a.test();




    }
}
abstract class A{

    abstract void  test();
}