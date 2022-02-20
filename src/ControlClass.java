import java.util.Scanner;


public class ControlClass {
    public static void main(String[] args) {

        /*单分支测试 if */
//        if (n1>10.0&&n2<20.0){
//            System.out.println(n1+n2);
//        }

        /*双分支测试if else*/
//        int age  ;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入测试年龄");
//        age = Integer.parseInt(scanner.nextLine());
//        if (age<18){
//            System.out.println("未成年人");
//        }else{
//            System.out.println("成年人");
//        }
//        double n1 = 30.0d;
//        double n2 = 10.0d;



        /*闰年测试*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入您要测试的年份");
//        int years = scanner.nextInt();
//
//        if (years%400 ==0||(years%4==0&&years%100!=0)){
//            System.out.println(years+"是闰年");
//        }else {
//            System.out.println(years +"不是闰年");
//        }

        /*多分支练习 if else if else 分数分段测试 */
//        int score ;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the score");
//        score = scanner.nextInt();
//        if (score<=25&&score>=0){
//            System.out.println("0<grades<=25");
//        }else if (score>25 && score<=50){
//            System.out.println("25<grades<=50");
//        }else if (score>50 &&score<=75){
//            System.out.println("50<grades<=75");
//        }else if (score>75 && score<=100){
//            System.out.println("75<grades<=100");
//        }else {
//            System.out.println("分数不在0-100之间");
//        }

        /*if 括号里可以是boolean赋值语句，先赋值后判断*/
//        boolean b = true;
//        int a=1;
//        if (a){
//            System.out.println("if里的b是"+b);
//        }
//        System.out.println("外边的b是"+ b);

        /*嵌套分支练习 比赛分组*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the score");
//        double score =scanner.nextDouble();
//        if(score>7.9){
//            //进入决赛
//            System.out.println("请输入您的性别");
//            char gender = scanner.next().charAt(0);
//            if (gender == '男'){
//                System.out.println("您被分配到"+gender+"子组");
//            }else if (gender == '女'){
//                System.out.println("您被分配到"+gender+"子组");
//            }else {
//                System.out.println("您输入的性别有误！");
//            }
//
//        }else {
//            System.out.println("您没有进入决赛资格！");
//        }



        /*switch练习*/
//        Scanner scanner = new Scanner(System.in);
//        char userint;
//        System.out.println("请输入a-g");
//        userint = scanner.next().charAt(0);
//
//        switch (userint){
//            case 'a':{
//                System.out.println("星期1");
//
//            }
//            case 'b':{
//                System.out.println("星期2");
//
//            }
//            case 'c':{
//                System.out.println("星期3");
//
//            }
//            case 'd':{
//                System.out.println("星期4");
//
//            }
//            case 'e':{
//                System.out.println("星期5");
//
//            }
//            case 'f':{
//                System.out.println("星期6");
//
//            }
//            case 'g':{
//                System.out.println("星期7");
//
//            }
//            default:{
//                System.out.println("您输入的字母不在范围");
//            }
//        }

        /*switch 大小写转换*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入要转换大写的字母a-b");
//        char c = scanner.next().charAt(0);
//
//        switch (c){
//            case 'a':{
//                System.out.println('A');
//                break;
//            }
//            case 'b':{
//                System.out.println('B');
//                break;
//            }
//            default:{
//                System.out.println("other");
//            }
//        }

        /*switch 成绩判断及格不及格*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入成绩");
//        double i = scanner.nextDouble();
//        //使用成绩除以60得到一个小数，取整，得到1或者0，1表示大于60，0表示小于60，大于120时候会变成2，所以不能输入大于100的值
//        if (i >= 0 && i <= 100) {
//            int v = (int) (i / 60);
//            switch (v) {
//                case 1: {
//                    System.out.println("及格");
//                    break;
//                }
//                case 0: {
//                    System.out.println("不及格");
//                    break;
//                }
//                default: {
//                    System.out.println("未知错误，未能判断");
//                }
//            }
//        } else {
//            System.out.println("您输入的成绩格式有误");
//        }


        /*季节判断 使用switch穿透*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您要判断季节的月份");
//        int i = scanner.nextInt();
//        switch (i) {
//            case 3:
//            case 4:
//            case 5: {
//                System.out.println("这是春季");
//                break;
//            }
//            case 6:
//            case 7:
//            case 8: {
//                System.out.println("这是夏季");
//                break;
//            }
//            case 9:
//            case 10:
//            case 11: {
//                System.out.println("这是秋季");
//                break;
//            }
//            case 12:
//            case 1:
//            case 2: {
//                System.out.println("这是冬季");
//                break;
//            }
//
//            default: {
//                System.out.println("您输入有误，请输入1-12的月份");
//            }
//        }

    }

}
