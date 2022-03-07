package com.carryman.commonclass.homework;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String a = "abcdef";

        String reverse = null;
        try {
            reverse = reverse(a, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return;

        }
        System.out.println(111);
        System.out.println(reverse);

    }

    public static String reverse(String s, int start, int end) {
        if (!(s != null && start >= 0 && end > start && end < s.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = s.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);


    }

}
