import java.util.*;

public class J003_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        System.out.println(a);
        sc.close();
    }
}
