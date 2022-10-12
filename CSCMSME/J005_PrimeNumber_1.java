import java.util.*;

public class J005_PrimeNumber_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2, flag = 0;
        if (n == 0 || n == 1)
            System.out.println("No");
        else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
        sc.close();
    }
}
