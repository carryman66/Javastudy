import java.util.Scanner;

public class WhileMatter {
    public static void main(String[] args) {

        /*while打印1-100*/
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }

        /*计算1-100的和*/

//        int i = 1;
//        int count=0;
//        while (i<=100){
//            count+=i;
//            System.out.println("1-100的和="+count);
//            i++;
//        }

        /*统计1-100能被5整除不能被3整除的值*/
//        int i = 1;
//        int count = 0;
//        while (i<=200){
//            if (i%5==0&&i%3!=0){
//                System.out.println("1-200能被5整除不能被3整除的值"+i);
//                count++;
//            }
//
//            i++;
//
//        }
//        System.out.println("个数为"+count);

        /*while 还钱*/
        char c = ' ';
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("还钱吗");
            c = scanner.next().charAt(0);

        } while (c != 'y');


    }
}
