package com.carryman.commonclass.math_;

/**
 * @author carry man
 * @version 1.0
 */
public class MathTest {
    public static void main(String[] args) {

        double pi = Math.PI;
        double e = Math.E;
        System.out.println(pi);
        System.out.println(e);
        //绝对值
        int abs = Math.abs(-9);


        //求幂 2的4次方
        double pow = Math.pow(2, 4);

        //ceil 向上取整 返回大于等于该参数的最小整数（转为double）
        double ceil = Math.ceil(3.1);
        System.out.println(ceil); //4.0

        //floor 向下取整 返回小于等于该参数的最小整数
        double floor = Math.floor(-2.8);
        System.out.println(floor);//-3

        //四舍五入
        long round = Math.round(3.6);
        System.out.println(round);

        //开方
        double sqrt = Math.sqrt(7);
        System.out.println(sqrt);

        //随机数 返回[0-1)的随机小数
        double random = Math.random();
        System.out.println(random);

//        [0-6)
//        [2-8)
//        取整
//        [2-7]
//        [a-b]
//        (int) ( a+Math.random()*(b-a+1));
        //返回两个数最大值
        int max = Math.max(123, 321);
        System.out.println(max);
        //返回两个值最小值
        int min = Math.min(123, 321);
        System.out.println(min);

    }
}
