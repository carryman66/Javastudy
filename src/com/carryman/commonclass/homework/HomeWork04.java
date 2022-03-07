package com.carryman.commonclass.homework;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        String s="123我撒我ASFffdsa+++";
        test(s);

    }


    public static void test(String str) {
        if (str == null) {
            System.out.println("输入不能为空");
            return;
        }
        char[] chars = str.toCharArray();
        int num=0;
        int zimu=0;
        int daxiezimu=0;
        int other=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='0'&&chars[i]<='9'){
                num++;
            }else if (chars[i]>='a'&&chars[i]<='z'){
                zimu++;
            }else if (chars[i]>='A'&&chars[i]<='Z'){
                daxiezimu++;
            }else {
                other++;
            }
        }
        System.out.println("数字有："+num+" 小写字母有："+zimu+" 大写字母有："+daxiezimu+" 其他有："+other);

    }
}
