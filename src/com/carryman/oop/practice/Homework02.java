package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());

    }

}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        return currentNum += 100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
