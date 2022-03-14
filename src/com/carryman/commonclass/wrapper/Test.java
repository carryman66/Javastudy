package com.carryman.commonclass.wrapper;



import java.util.Arrays;

/**
 * @author carry man
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Byte aByte = Byte.valueOf("-11");
        Short aShort = Short.valueOf("123");
        Integer integer = Integer.valueOf("123");
        Long aLong = Long.valueOf("333333333333");

        Float aFloat = Float.valueOf("123.11");
        Double aDouble = Double.valueOf("21.3");

        Boolean a = Boolean.valueOf("false");
        Character character = Character.valueOf('我');


        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aByte);
        System.out.println(character);
        System.out.println(a);
        System.out.println(aLong);
        System.out.println(aShort);
        System.out.println(integer);

        System.out.println("===============");


        String s1= "北京欢迎你";
        byte[] bytes = s1.getBytes();

        byte[] n= {-26,-120,-111};

        char[] chars = s1.toCharArray();

        System.out.println(Arrays.toString(chars));


        String string = new String(n);

        System.out.println(string);

        System.out.println(Arrays.toString(bytes));

        Emp emp = new Emp("王", 10000);




    }
}



class Emp{
    private  String name;
    private  int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
