package com.carryman.commonclass.arrays_;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author carry man
 * @version 1.0
 */
public class Systeam_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12321111111111111111111111114");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(new BigInteger("123"));
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(new BigInteger("123"));
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(BigInteger.valueOf(2L));
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(BigInteger.valueOf(2));
        System.out.println(divide);
        System.out.println("================================================");

        BigDecimal bigDecimal = new BigDecimal("123.1111111111111111133333333333333333388888888888");
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("1.3");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,10, RoundingMode.DOWN));


    }
}
