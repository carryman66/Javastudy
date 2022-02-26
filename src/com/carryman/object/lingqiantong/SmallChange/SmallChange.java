package com.carryman.object.lingqiantong.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        //1.界面循环
        //程序标识符,FALSE退出
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        String key;

        //2.零钱通明细
        String changeDetails="---------------零钱通明细---------------";

        //3.收益入账
        double incomes;
        //余额
        double balance=0;

        //日期


        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        //4.消费

        //消费说明
        String explain;
        //消费金额
        double expenses;


        do {
            System.out.println("\n===============零钱通===============");
            System.out.println("\t\t\t1 零钱通明细\t\t\t");
            System.out.println("\t\t\t2 收益入账\t\t\t");
            System.out.println("\t\t\t3 消费\t\t\t");
            System.out.println("\t\t\t4 退      出\t\t\t");

            System.out.print("请选择(1-4)：");
            key = scanner.next();
            switch (key){
                case "1":{
                    System.out.println(changeDetails);
                    break;
                }
                case "2":{
                    System.out.println("---------------收益入账---------------");
                    System.out.print("输入您入账的金额: ");
                    //得到收入金额
                    incomes = scanner.nextDouble();
                    //校验收入金额
                    if (incomes<=0){
                        System.out.println("收益金额范围应>0");
                        break;
                    }


                    balance+=incomes;

                    changeDetails+="\n收益 "+incomes +"\t"+sdf.format(new Date()) +"\t当前余额 "+balance;


                    break;
                }
                case "3":{
                    System.out.println("---------------消费---------------");
                    System.out.print("输入您消费的金额: " );
                    //得到消费金额
                    expenses = scanner.nextDouble();
                    //优先判断不正确的条件（编程思想）

                    //校验消费金额
                        //消费金额<=0
                        //消费金额>余额
                    if (expenses<=0 ||expenses>balance){
                        System.out.println("您的消费金额应该在0-"+balance);
                        break;
                    }





                    //消费说明
                    System.out.print("输入您消费说明: " );
                    explain = scanner.next();

                    //更新余额
                    balance-=expenses;

                    //添加进消费明细
                    changeDetails+="\n消费 "+expenses +"\t"+sdf.format(new Date()) +"\t当前余额 "+balance+"\t消费说明："+explain;


                    break;
                }
                case "4":{
                    char c;
                    //输入y/n，否则一直输入
                    do {

                        System.out.println("您确定要退出吗？请输入y/n");
                        c = scanner.next().charAt(0);

                    } while (c != 'y' && c != 'n');
                    //如果是y就退出程序，n就退出循环到主界面
                    if (c=='y'){
                        System.out.println("正在退出零钱通…………");
                        flag=false;
                    }
                    break;

                }
                default:{
                    System.out.println("您输入的值有误，请检查后重新输入！");
                }
            }


        }while (flag);
    }

}
