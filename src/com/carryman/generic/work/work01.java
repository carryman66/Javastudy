package com.carryman.generic.work;

import java.util.*;

/**
 * @author carry man
 * @version 1.0
 */
public class work01 {
    public static void main(String[] args) {
        Emp n = new Emp("n", 1);
        Emp b = new Emp("b", 1);
        Emp s = new Emp("s", 1);

        HashSet<Emp> emps = new HashSet<>();
        emps.add(n);
        emps.add(b);
        emps.add(s);

        Iterator<Emp> iterator = emps.iterator();
        while (iterator.hasNext()) {
            Emp next = iterator.next();
            System.out.println(next.getName());
        }

        for (Emp emp : emps) {
            System.out.println(emp.getName());

        }


        HashMap<String, Emp> stringEmpHashMap = new HashMap<>();
        stringEmpHashMap.put(n.getName(),n);
        stringEmpHashMap.put(b.getName(),b);
        stringEmpHashMap.put(s.getName(),s);


        Iterator<String> iterator1 = stringEmpHashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            Emp emp = stringEmpHashMap.get(next);
            System.out.println(emp);
        }

        Set<Map.Entry<String, Emp>> entries = stringEmpHashMap.entrySet();
        Iterator<Map.Entry<String, Emp>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Emp> next = iterator2.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }
        for (Map.Entry<String, Emp> emp : entries) {
            System.out.println(emp.getKey()+""+emp.getValue());


        }
        Iterator<Emp> iterator3 = stringEmpHashMap.values().iterator();
        while (iterator3.hasNext()) {
            Emp next = iterator3.next();
            System.out.println(next.getClass());
        }


    }
    static  class  Emp{
        private String name;
        private  int id;

        public Emp(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
