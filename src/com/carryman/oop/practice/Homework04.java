package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.test(new Com() {
            @Override
            public double word(double a, double b) {
                return a+b;
            }
        },10,20);


        cellphone.test(new Com() {
            @Override
            public double word(double a, double b) {
                return a*b;
            }
        },10,20);
    }

}

interface Com{
    double word(double a,double b);
}

class Cellphone{

    public void test(Com com,double a,double b){
        double word = com.word(a, b);
        System.out.println(word);
    }


}