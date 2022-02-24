package com.carryman.oop;

public class OopClass {







    public static void main(String[] args) {


        Cat cat = new Cat();

        cat.age=10;


        System.out.println(cat.age);



        cat.addAge2(10);

        System.out.println(cat.age);




//        B b = new B();
//        int[]array={0,0,0};
//        b.upDateArray(array);
//        System.out.println(array[0]);

    }
}



class Cat{
    String name;
    int age;
    String breed;

    public int   addAge2(int a){
        age+=a;

        return age;
    }

    public void   addAge(Cat cat,int a){
         cat.age+=a;

    }



    public int sum(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }






}
class B{
    public void upDateArray(int[]a){
        a[0]=11;
    }
}
