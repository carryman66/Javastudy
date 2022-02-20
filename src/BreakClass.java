public class BreakClass {
    public static void main(String[] args) {
        /*break练习*/
//        int count=0;
//
//        while (true){
//            count++;
//            if ((int)(Math.random()*100)==0){
//                break;
//            }
//
//        }
//        System.out.println(count);

        label1:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break label1;
                }
                System.out.println("i=" + i + ",j=" + j);

            }

        }
    }
}
