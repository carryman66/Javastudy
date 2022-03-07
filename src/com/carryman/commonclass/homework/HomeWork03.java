package com.carryman.commonclass.homework;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "国宝 特工 牛";
        printName(name);

    }

    public static void printName(String str){


        if (str==null){
            System.out.println("不能为空");
            return;
        }

        String[] name = str.split(" ");

        if (name.length!=3){
            System.out.println("name长度不对");
            return;
        }

        String format = String.format("%s,%s.%c", name[2], name[0], name[1].toUpperCase().charAt(0));

        System.out.println(format);


    }}
