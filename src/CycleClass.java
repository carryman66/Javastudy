/**
 * 循环类
 * 练习 循环控制 用法
 */
public class CycleClass {
    public static void main(String[] args) {
        /*for使用*/
//        int i;
//        for (i = 1; i <= 3; ++i) {
//            System.out.println(i);
//        }
//        System.out.println(i);

        /*for倒计时*/
//        for (int i = 10; i >0 ; i--) {
//            System.out.println("倒计时"+i);
//        }
        /*for 变量迭代可以在for代码块中*/
//        int i;
//        for (i = 0; i <10; ) {
//            System.out.println(i);
//            ++i;
//        }
//        System.out.println(i);

        /*for控制语句为真则进入for循环操作语句*/
//        int count = 10;
//        for (int i = 0,count = 0;  count<count || i <=count ; i++,count += 10) {
//            System.out.println("i是"+i);
//            System.out.println("j是"+count);
//        }
        // 1       i=0 count=0  输出   i=1  count=10
        // 2       i=1 count=10 输出   i=2  count=20
        // 3       i=2 count=30

        /*打印 [start-end] 所有t的倍数 并且计算和*/

//        //开始数值
//        int start = 90;
//        //结束数值
//        int end = 100;
//        //倍数
//        int t = 5;
//
//        int count = 0;
//        int sum = 0;
//        for (int i = start; i <=end; i++) {
//            if ( i%t == 0){
//                System.out.println(i);
//                count++;
//                sum+=i;
//            }
//        }
//        System.out.println("一共有"+ count +"个");
//        System.out.println("和为"+ sum);

        /*start开始到end结束所有的加法*/

//        int start = 0;
//        int end = 100;
//
//        for (int i = start; i <=end ; i++) {
//            System.out.println(i+"+"+(end-i)+"="+end);
//
//        }




        /*while循环*/
//        int i=0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("退出while循环继续执行");
//        System.out.println(i);


        /*while1-100能被3整除的所有的数*/
//        int count=1;
//        while (count<=100){
//            if (count%3==0){
//                System.out.println(count);
//            }
//            count++;
//        }

        /*打印40-100所有偶数*/
//        int start = 40;
//
//        while (start<=100){
//            if (start%2==0){
//                System.out.println(start);
//            }
//            start++;
//        }


        /*do while循环*/
        int i = 1;
        do {
            System.out.println("你好 while" + i);
            i++;
        } while (i <= 10);


    }

}
