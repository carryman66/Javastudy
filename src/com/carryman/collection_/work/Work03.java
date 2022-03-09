package com.carryman.collection_.work;

import java.util.*;

/**
 * @author carry man
 * @version 1.0
 */
public class Work03 {
    public static void main(String[] args) {
        Book book1 = new Book("优势谈判", 120, "罗杰·道森");
        Book book2 = new Book("六祖坛经", 980, "星云大师");
        Book book3 = new Book("传习录", 920, "王守仁");
        ArrayList arrayList = new ArrayList();
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        LinkedList linkedList = new LinkedList();
        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);

        Vector vector = new Vector();
        vector.add(book1);
        vector.add(book2);
        vector.add(book3);

        System.out.println("iterator实现");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {

            Object next = iterator.next();
            System.out.println(next);
        }


        System.out.println("增强for循环实现");
        for (Object o : linkedList) {
            System.out.println(o);
        }


        System.out.println("普通for循环实现");
        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.get(i);
            System.out.println(o);
        }

        sort(arrayList);
        System.out.println("排序后 iterator实现");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {

            Object next = iterator.next();
            System.out.println(next);
        }

    }

    public static void sort(List list){



        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);

                if (book1.getPrice()<book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);

                }
            }
        }

    }
}

class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "名称：" + name +
                        "\t\t价格：" + price +
                        "\t\t作者：" + author;
    }
}
