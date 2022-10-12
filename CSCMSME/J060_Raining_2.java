public class J060_Raining_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] bucket = new int[n + 10];
        int[] dp = new int[n + 10];
        for (int i = 0; i < q; i++) {
            int strng = sc.nextInt();
            int enrng = sc.nextInt();
            bucket[strng - 1]++;
            bucket[enrng]--;
        }
        dp[0] = bucket[0];
        System.out.print(dp[0] + " ");
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + bucket[i];
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
