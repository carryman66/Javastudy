package com.carryman.commonclass.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Book book1 = new Book("红楼梦第五回", 40);
        Book book2 = new Book("三国演义", 50);
        Book book3 = new Book("水浒传第十五回", 20);
        Book book4 = new Book("西游记", 67);

        Book[] books = {book1, book2, book3, book4};

        System.out.println(Arrays.toString(books));


        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {

                if ((o1.getPrice()-o2.getPrice())>0){

                    return 1;
                }else if ((o1.getPrice()-o2.getPrice())<0){
                    System.out.println("价格小于0");
                    return -1;
                }else return 0;

            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if ((o1.getPrice()-o2.getPrice())>0){
                    return -1;
                }else if ((o1.getPrice()-o2.getPrice())<0){
                    return 1;
                }else return 0;
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int b1 = o1.getName().length();
                int b2 = o2.getName().length();
                System.out.println(b1-b2);
                return b1-b2;
            }
        });
        System.out.println(Arrays.toString(books));



    }
}

class Book{
    private String name;
    private  double price;


    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
