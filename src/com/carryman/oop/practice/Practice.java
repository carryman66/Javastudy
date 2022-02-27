package com.carryman.oop.practice;

public class Practice {
    public static void main(String[] args) {
        /*第一题*/
//        Person p1 = new Person("小米", 20, 2);
//        Person p2 = new Person("小刘", 18, 2);
//        Person p3 = new Person("小李", 30, 2);
//
//
//
//        Person[]people= {p1,p2,p3};
//
//
//        Person person;
//        for (int i = 0; i < people.length-1; i++) {
//            for (int j = 0; j < people.length-1-i; j++) {
//                if (people[j].getAge()<people[j+1].getAge()){
//                    person=people[j];
//                    people[j]=people[j+1];
//                    people[j+1]=person;
//
//                }
//            }
//        }
//
//        for (Person p : people) {
//            System.out.println(p.getAge());
//        }
        /*第二题*/
        /*              同类       同包         子类         不同包
         *  public       可以       可以         可以        可以
        *    protected    可以       可以          可以      不可
        *   默认       可以        |    可以     不可    |   不可
         *  private      可以       不可         不可        不可
         *
        *
        *
        * */


        /*第三题 教授*/
        /*第四题 员工*/

        /*第六题*/

        //在father类
        // super可以访问name=aa， g1() super()
        //this 可以访问 id score f1  this.name this.g1
        //
        // 在son中super name=aa，g1是重写后的，id=001，f1（）

        //this可以访问name g1 show

        //第七题
        //Test
        //Demo
        //Rose
        //Jack

        //John
        //Jack


        /*第8题*/
        //银行这个不会

        //第九题
        //第10题


        //第11题
        //        Person person =new Studnet();
        //调用eat 输出person eat；
        //调用run  输出student run

        //向下转型
        // Studnetn st=(Stundet) person；
        //调用run 输出stun run
        //调用study
        //继承父类 还可调用eat()


        /*第12题*/

        //==和equals
        //==是比较运算符
        // 判断基本数据类型的值和引用数据类型的地址
        //equals是object的方法，java所有类都可以使用equals
        //判断对象是否相等，但往往会重写该方法判断对象的属性是否相等比如String integer
        //

        /*13题*/
        //麻烦

        /*14题*/
        //我是a类
        //hhh我是b类的有参构造
        //我是c类的有参构造
        //我是c类的无参构造


        //15题
        //多态就是根据传入类型或者方法执行的对象不同，一个方法有多种结果的状态
        //方法多态
        //在构造器重载体现了多态
        //在方法的重写也体现了多态
        //对象多态
        //对象的编译类型和运行类型可以不一致，编译看=号左边，运行类型看=右边
        //编译类型在定义时候已经确定
        //运行类型是可以变化，通过getclass()查看

        //16题
        //java的动态绑定机制是根据运行地址找到对应的执行对象，

    }
}

