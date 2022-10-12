public class J094_Swap_Arrays {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        java.util.Arrays.sort(arr);
        int len = n / 2;
        n--;
        for (int i = 0; i < len; i += 2, n -= 2) {
            double tmp = arr[i];
            arr[i] = arr[n];
            arr[n] = tmp;
        }
        for (double i : arr) {
            System.out.printf("%.2f ", i);
        }
        System.out.println();
        sc.close();
    }
}