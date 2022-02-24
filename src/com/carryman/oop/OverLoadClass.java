package com.carryman.oop;

public class OverLoadClass {


    public static void main(String[] args) {

        Method method = new Method();

        System.out.println(method.showScore("守一", 11, 11, 11));
    }
}

class Method{
    public int t(int a){
        return a;

    }
    public int t(int...b){

        int sum=0;
        for (int i = 0; i < b.length; i++) {
            sum+=b[i];

        }
        return sum;
    }

    public String showScore(String name,double...score){
        double sum=0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        return name+"的成绩为："+sum;
    }
}
