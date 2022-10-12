public class J057_Partial_Sum_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int st = sc.nextInt();
            int en = sc.nextInt();
            int sum = 0;
            for (int j = st; j <= en; j++) {
                sum += a[j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
