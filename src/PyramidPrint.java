public class PyramidPrint {
    public static void main(String[] args) {

        /*打印半个金字塔
         */
//        *
//        **
//        ***
//        ****
//        *****

        /*打印金字塔*/
        //      *
        //     ***
        //    *****
        //   *******
        //  *********


        /*打印空心金字塔*/
        //      *                1    当前行的第一个位置和最后一个位置是※
        //     * *               2
        //    *   *              2
        //   *     *             2
        //  *********            9


        //自定义层数
        int numberHigh = 30;

        for (int i = 1; i <= numberHigh; i++) {
            for (int k = 1; k <= numberHigh - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == numberHigh) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }

            System.out.println();
        }


    }
}
