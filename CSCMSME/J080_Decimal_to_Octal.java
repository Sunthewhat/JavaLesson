public class J080_Decimal_to_Octal {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toOctalString(n));
        sc.close();
    }
}
