public class MaxMin {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int mx = -1, mn = 100000000;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            mx = Math.max(mx, tmp);
            mn = Math.min(mn, tmp);
        }
        System.out.println(mx + " " + mn);
        sc.close();
    }
}
