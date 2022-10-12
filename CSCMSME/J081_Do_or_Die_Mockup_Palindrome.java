public class J081_Do_or_Die_Mockup_Palindrome {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int N = A.length() / 2;
        int n = A.length() - 1;
        boolean ch = true;
        for (int i = 0; i < N; i++, n--) {
            if (A.charAt(i) != A.charAt(n))
                ch = false;
        }
        System.out.println(ch ? "YES" : "NO");
        sc.close();
    }
}
