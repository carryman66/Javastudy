package com.carryman.map_.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author carry man
 * @version 1.0
 */
public class Work01 {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1, "李", 19000);
        Emp emp2 = new Emp(2, "王", 129000);
        Emp emp3 = new Emp(3, "赵", 22000);

        Map hashMap = new HashMap();
        hashMap.put(emp1.getId(),emp1);
        hashMap.put(emp2.getId(),emp2);
        hashMap.put(emp3.getId(),emp3);
        //使用keyset 得到key 然后得到value

        //使用增强for
        Set set1 = hashMap.keySet();
        for (Object o : set1){
            Object o1 = hashMap.get(o);
            Emp emp=(Emp)o1;
            if (emp.getSalary()>18000){
                System.out.println(emp);
            }

        }

        //迭代器 使用keyset得到value

        //使用增强for
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Emp e = (Emp)hashMap.get(next);
            if (e.getSalary()>18000){
                System.out.println(e);
            }
        }


        //使用entryset 得到整个map对象
        //节点是node
        //但是node继承了entry
        //entry可以得到键和值
        //转型mapentry得到对象的value

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Map.Entry e =(Map.Entry)next;
            Emp value =(Emp) e.getValue();
            if (value.getSalary()>18000){
                System.out.println(e.getKey()+"-"+e.getValue());
            }

        }
        //增强for循环

        for (Object o :set) {

            Map.Entry entry = (Map.Entry) o;


            Emp emp = (Emp) entry.getValue();
            if (emp.getSalary()>18000){
                System.out.println(emp);
            }
        }





    }
}

class Emp {
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}