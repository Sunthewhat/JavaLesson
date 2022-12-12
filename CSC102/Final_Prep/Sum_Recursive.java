public class Sum_Recursive {
    public static int sum(String S, int pos) {
        if (pos == S.length() - 1)
            return S.charAt(pos) - '0';
        else
            return S.charAt(pos) - '0' + sum(S, pos + 1);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(sum(S, 0));
        sc.close();
    }
}
