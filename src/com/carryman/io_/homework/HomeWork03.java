package com.carryman.io_.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileReader fileReader = new FileReader("src\\resource\\dog.properties");

        Properties properties = new Properties();
        properties.load(fileReader);
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String color = properties.getProperty("color");

        System.out.println(name+" "+age+" "+color);
        Dog dog = new Dog(name, Integer.parseInt(age), color);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\Dog.dat"));
        Dog dog1 = (Dog)inputStream.readObject();
        System.out.println(dog1.getName());
        System.out.println(dog1);
        inputStream.close();


    }
    @Test
    public void writerDogPro() throws IOException {

        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");

        properties.store(new FileWriter("src\\resource\\dog.properties"),null);
    }
    static  class  Dog implements Serializable {
        private static final long serialVersionUID=1L;
        private String name;
        private int age;
        private String color;

        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
