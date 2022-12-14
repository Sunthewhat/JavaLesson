import java.util.Arrays;

public class Secondminmax {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextDouble();
        Arrays.sort(a);
        System.out.printf("%.2f %.2f", a[1], a[n - 2]);
        sc.close();
    }
}