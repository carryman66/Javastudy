public class ContinueClass {
    public static void main(String[] args) {

        /*while 使用continue*/
//        int i = 0;
//        while (i<10){
//            i++;
//        if (i==2){
//         continue;
//        }
//        System.out.println("我是while层"+i);
//    }


//        for (int j = 1; j <=10; j++) {
//            if (j==2){
//                continue;
//            }
//            System.out.println(j);
//        }

//        label1:
//        for (int i = 1; i <=4; i++) {
//            for (int j = 1; j <=10; j++) {
//                if(j==2){
//                    continue label1;
//                }
//                System.out.println("i="+i+",j="+j);
//
//            }
//        }

//        for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j==2){
//                    break ;
//                }
//                System.out.println("i="+i+",j="+j);
//
//            }
//
//
//        }

        for (int j = 0; j < 10; j++) {
            if (j == 2) {
                break;
            }
            System.out.println("j=" + j);

        }
    }
}
