public class J086_Do_or_Die_Mockup_Multiplication {
    public static int multiply(int n, int i) {
        if (i == 1)
            return n;
        int m = n + multiply(n, i - 1);
        return m;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(multiply(n, i));
        sc.close();
    }
}
