public class MaxNumber {
    public static void main(String[] args) {

        int n1 = 321123;
        int n2 = 2321222;
        int n3 = 121111133;

        int number = n1 > n2 ? n1 : n2;

        int max = number > n3 ? number : n3;

        System.out.println(max);
    }
}
