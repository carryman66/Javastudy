package com.carryman.wrapper;

/**
 * @author carry man
 * @version 1.0
 */
public class Wrapper01 {
    public static void main(String[] args) {

        //包装类转String

        Integer i = 100;


        //方式1
        String s1 = i + "";
        //方式2
        String s2 = i.toString();
        //方式3
        String s3 = String.valueOf(i);

        //String转为包装类Integer
        String s="123";

        //方式1
        int i1 = Integer.parseInt(s);
        //方式2
        Integer i2 = new Integer(s);
        //方式3
        Integer i3 = Integer.valueOf(s);

        boolean a= false;

    }
}
