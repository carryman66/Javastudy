package com.carryman.map_.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {

        Person aa = new Person("aa", "1001");
        Person bb = new Person("bb", "1002");

        HashSet hashSet = new HashSet();
        hashSet.add(aa);
        hashSet.add(bb);
        aa.name="cc";
        hashSet.remove(aa);
        System.out.println(hashSet);
        hashSet.add(new Person("cc","1001"));
        System.out.println(hashSet);
        hashSet.add(new Person("aa","1001"));
        System.out.println(hashSet);

    }
    static  class  Person{
        private String name;
        private String text;

        public Person(String name, String text) {
            this.name = name;
            this.text = text;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(text, person.text);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, text);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }
}
