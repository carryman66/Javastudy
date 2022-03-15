package com.carryman.generic.work;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author carry man
 * @version 1.0
 */
public class work02 {
    public static void main(String[] args) {
        Emp emp1 = new Emp("t", 1000, new MyDate(1999, 4, 1));
        Emp emp2 = new Emp("t", 2000, new MyDate(1929, 2, 1));
        Emp emp3 = new Emp("t", 4000, new MyDate(1979, 8, 1));
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i!=0){
                    return i;
                }
                return o1.getMyDate().compareTo(o2.getMyDate());

            }
        });

        System.out.println(emps);

    }
    static class Emp<E>{
        private String name;
        private int salary;
        private MyDate myDate;


        public Emp(String name, int salary, MyDate myDate) {
            this.name = name;
            this.salary = salary;
            this.myDate = myDate;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", myDate=" + myDate +
                    '}';
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

        public MyDate getMyDate() {
            return myDate;
        }

        public void setMyDate(MyDate myDate) {
            this.myDate = myDate;
        }
    }
    static class  MyDate implements  Comparable<MyDate>{
        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
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
        public int compareTo(MyDate o) {
            int i = this.getYear() - o.getYear();
            if (i!=0){
                return i;
            }
            int i1 = this.getMonth() - o.getMonth();
            if (i1!=0){
                return i1;
            }
            return this.getDay() - o.getDay();
        }
    }
}
