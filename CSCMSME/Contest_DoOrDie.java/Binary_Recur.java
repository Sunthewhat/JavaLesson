public class Binary_Recur {
    public static String binary(int a) {
        if (a == 1)
            return "1";
        return a % 2 == 0 ? binary(a / 2) + "0" : binary(a / 2) + "1";
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        String ans = binary(a);
        System.out.println(ans);
        sc.close();
    }
}