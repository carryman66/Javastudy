package com.carryman.collection_.work;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author carry man
 * @version 1.0
 */
public class Work05 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Emp("明1",100,new MyDate(1865,19,12)));
        hashSet.add(new Emp("王2",100,new MyDate(1235,19,12)));

        hashSet.add(new Emp("明1",1010,new MyDate(1865,19,12)));
        System.out.println(hashSet);

    }
}

class  Emp{
    private String name;
    private int sal;
    private  MyDate date;


    public Emp(String name, int sal, MyDate date) {
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) && Objects.equals(date, emp.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
