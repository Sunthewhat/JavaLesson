import java.util.*;

public class J019_The_power_of_power {

    public static long rec(long a, int b, long c) {
        // if (b == 0l)
        // return 1l % c;
        // if (b == 1l)
        // return a % c;
        // long h = rec(a, b / 2, c);
        // long f = (h * h) % c;
        // if (b % 2 == 1)
        // f = (f * a) % c;
        // return f;
        long[] dp = new long[50];
        long ans = 1;
        dp[0] = a;
        for (int i = 1; i <= 32; i++) {
            dp[i] = (dp[i - 1] * dp[i - 1]) % c;
        }
        for (int i = 31; i >= 0; i--) {
            if ((b & (1 << i)) != 0) {
                ans *= dp[i];
                ans %= c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long a = sc.nextLong();
            int b = sc.nextInt();
            long m = sc.nextLong();
            System.out.println(rec(a, b, m));
        }
        sc.close();
    }
}
