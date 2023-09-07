public class Quiz_1_2_Factorial {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long fac = 1;
        int ch = 0;
        for (int i = 1; i <= n; i++) {
            fac *= i;
            if (fac == n) {
                ch = 1;
                break;
            }
            if (fac > n)
                break;
        }
        if (ch == 1)
            System.out.println("This number is a result of factorial.");
        else
            System.out.println("This number is not a result of factorial.");
        sc.close();
    }
}