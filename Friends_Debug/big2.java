import java.util.Scanner;

public class big2 {
    public static long binary(int a) {
        if (a <= 0) {
            return 0;
        } else {
            return a % 2 + 10 * (binary(a / 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long ans = binary(a);
        System.out.println(ans);
        sc.close();
    }
}