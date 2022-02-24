package com.carryman.oop;

public class FibonacciClass {
    public static void main(String[] args) {

        MyTool myTool = new MyTool();
        int i = myTool.fBNQ(5);
        System.out.println(i);
    }
}

class MyTool{
    public int fBNQ(int num){
        if (num>=1){
            if (num==1||num==2){
                return 1;
            }
            else {
              return fBNQ(num-1)+fBNQ(num-2);

            }

        }
        return -1;
    }

}

