public class J091_Round {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double A = sc.nextDouble();
        A = Math.round(A);
        int n = (int) A;
        System.out.println(n % 7 == 0 || n % 10 == 7 ? "Unlucky" : "Lucky");
        sc.close();
    }
}