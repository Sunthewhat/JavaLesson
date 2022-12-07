public class J162_Combinatoric {
    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        System.out.println(factorial(n) / (factorial(n - r) * factorial(r)));
        sc.close();
    }
}