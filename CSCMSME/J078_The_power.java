public class J078_The_power {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((int) Math.pow(a, b));
        sc.close();
    }
}