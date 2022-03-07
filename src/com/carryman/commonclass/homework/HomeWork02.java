package com.carryman.commonclass.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork02 {


    public static void main(String[] args) {
        String name="红果果";
        String pass="123456";
        String email = "123@qq.com";


        try {
            userRegister(name,pass,email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("注册成功");


    }



    public static void userRegister(String name,String pass,String email){
        if (!(name.length()>=2&&name.length()<=4)){
            throw  new RuntimeException("用户名长度异常，应为2-4位");
        }
        if (!(pass.length()==6)&&isDigital(pass)){
            throw  new RuntimeException("密码长度异常，应为6位");
        }
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if (!((index1>0)&&index1<index2)){
            throw new RuntimeException("邮箱错误，包含@.");
        }


    }

    //判断输入的是否为数字
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;


    }




}




