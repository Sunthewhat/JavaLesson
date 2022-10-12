public class J087_Do_or_Die_Mockup_Sum_Digits {

    public static int sdigt(String A, int len, int sum) {
        if (len < 0) {
            System.out.println(sum);
            return 0;
        }
        sum += A.charAt(len) - '0';
        sdigt(A, len - 1, sum);
        return sum;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length() - 1;
        sdigt(A, len, 0);
        sc.close();
    }
}