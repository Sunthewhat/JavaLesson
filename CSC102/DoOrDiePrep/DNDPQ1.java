public class DNDPQ1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt() - 5;
        int res = 0;
        for (int i = n; i <= n + 10; i++) {
            if (i % 3 == 0)
                res -= i;
            else
                res += i;
        }
        System.out.println(res);
        sc.close();
    }
}
