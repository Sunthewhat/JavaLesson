import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        for (int i = a.length - 1; i > a.length - 4; i--) {
            System.out.printf("%.1f ", a[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.1f ", a[i]);
        }
        sc.close();
    }
}