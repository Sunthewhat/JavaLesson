public class J058_Partial_Sum_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int len = sc.nextInt();
        int[] sum = new int[len + 1];
        sum[0] = 0;
        for (int i = 0; i < len; i++) {
            sum[i + 1] = sc.nextInt() + sum[i];
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int st = sc.nextInt();
            int en = sc.nextInt();
            System.out.println(sum[en + 1] - sum[st]);
        }
        sc.close();
    }
}