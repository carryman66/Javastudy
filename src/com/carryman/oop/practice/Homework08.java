package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {

        Color black = Color.BLACK;
        black.show();
        String name = black.name();
        System.out.println(name);

        switch (black){
            case RED:{
                System.out.println("红色");
                break;
            }
            case BLACK:{
                System.out.println("黑色");
                break;
            }
            default:{
                System.out.println("下次一定");
            }
        }

    }
}


interface ColorInterface{
    void show();
}

enum Color implements ColorInterface{

    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),WHITE(255,255,255);


    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    @Override
    public void show(){
        System.out.println("属性值为"+red+","+green+","+blue);
    }
}
