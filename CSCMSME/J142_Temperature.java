public class J142_Temperature {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        B = (B * 9 / 5) + 32;
        System.out.println(A == B ? "Same" : A > B ? "Higher" : "Lower");
        sc.close();
    }
}