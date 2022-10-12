public class J044_Factor_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int cnt = 0;
            int sum = 0;
            int n = sc.nextInt();
            for (int j = 2; j <= n; j++) {
                cnt = 0;
                while (n % j == 0) {
                    n /= j;
                    cnt++;
                }
                if (cnt > 0) {
                    if (sum == 0)
                        sum += cnt + 1;
                    else
                        sum *= cnt + 1;
                }
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        sc.close();
    }
}