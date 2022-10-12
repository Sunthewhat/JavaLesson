public class J089_Capitalized {
    public static void Capfind(String A, int len, int index) {
        if (index == len)
            return;
        if (A.charAt(index) >= 'A' && A.charAt(index) <= 'Z')
            System.out.print(A.charAt(index));
        Capfind(A, len, index + 1);
        return;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length();
        Capfind(A, len, 0);
        System.out.println();
        sc.close();
    }
}
