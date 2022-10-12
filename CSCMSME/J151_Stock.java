public class J151_Stock {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int streak = 0, tmp = 0, mxstreak = 0;
        for (int i = 0; i < n; i++) {
            int stock = sc.nextInt();
            if (stock > tmp)
                streak++;
            else {
                mxstreak = Math.max(mxstreak, streak);
                streak = 1;
            }
            tmp = stock;
        }
        System.out.println(mxstreak);
        sc.close();
    }
}
