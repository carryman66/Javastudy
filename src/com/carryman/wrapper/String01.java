package com.carryman.wrapper;

/**
 * @author carry man
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {

//        byte []  a={0x0F, 0x1F, 0x2F, 0x3F, 0x4F, 0x5F, 0x6F};

        String a = "abcdebfg";
        int b = a.lastIndexOf("b");
        System.out.println(b);
        //大写
        String s = a.toUpperCase();
        //小写
        String s1 = s.toLowerCase();


        //拼接
        String concat = s1.concat(s).concat("123");


        //替换//真正替换的是返回的结果
        //原字符串不会受影响，

        String replace = concat.replace("a", "nn");


        //分割 用a分割
        String[] as = replace.split("a");

        //比较字符大小
        //两个字符串长度相同，并且每个字符也相同就返回0
        //如果长度相同或不相同，可以区分大小写
        //前边有部分相同就返回第一个字符串的长度-第二个字符串的长度
        int i = replace.compareTo(s);

        //格式化

        //占位符 %s %d %.2f %c
        //%s 用字符串替换
        //%d 用整数
        //%.2f 用小数 替换保留两位
        //%c 用char类型替换

        String sFormat="我是%s，你是%s";
        String format = String.format(sFormat, "f", "猪");
        System.out.println(format
        );
        StringBuffer stringBuffer = new StringBuffer();


    }
}
