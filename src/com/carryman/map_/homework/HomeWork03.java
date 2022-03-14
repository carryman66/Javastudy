package com.carryman.map_.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Emp jack = new Emp("jack", 650);
        Emp tom = new Emp("tom", 1200);
        Emp smith = new Emp("smith", 2900);

        HashMap hashMap = new HashMap();
        hashMap.put(jack.getName(),jack.getSalary());
        hashMap.put(tom.getName(),tom.getSalary());
        hashMap.put(smith.getName(),smith.getSalary());

        jack.setSalary(2600);
        hashMap.put(jack.getName(),2600);





        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();

        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.getKey()+"-----"+next.getValue());
        }

        Set set = hashMap.keySet();
        for (Object o :set) {
            System.out.println(o);
            System.out.println(((int)hashMap.get(o))+100);
        }


    }
    static class Emp{
        private String name;
        private int salary;

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
}
