
/**
 * Median#1
 */
import java.util.*;

public class J001_Median_1 {
    public static int Med(int a, int b, int c) {
        int mn = Math.min(c, Math.min(a, b));
        int mx = Math.max(c, Math.max(a, b));
        if (a != mn && a != mx)
            return a;
        if (b != mn && b != mx)
            return b;
        else
            return c;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        int result = Med(a[0], a[1], a[2]);
        System.out.println(result);
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}