public class arrays_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int mx = 0;
        int mn = 1000;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            mx = Math.max(mx, a);
            mn = Math.min(mn, a);
        }
        System.out.println("Max is: " + mx);
        System.out.println("Min is: " + mn);
        sc.close();
    }
}
