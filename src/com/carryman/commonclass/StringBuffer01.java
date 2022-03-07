package com.carryman.commonclass;

/**
 * @author carry man
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        String num= "1111222333.111";
        StringBuffer stringBuffer = new StringBuffer(num);
        int index = stringBuffer.indexOf(".");


        for (int i= index-3;i>0;i-=3){
            stringBuffer.insert(i,",");
        }

        System.out.println(stringBuffer);
    }

}
