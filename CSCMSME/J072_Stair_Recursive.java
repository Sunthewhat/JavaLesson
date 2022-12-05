public class J072_Stair_Recursive {
    public static int stair(int n) {
        if (n == 1)
            return 1;
        if (n < 1)
            return 0;
        return stair(n - 1) + stair(n - 2);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}