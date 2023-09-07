public class J025_StepBack {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mx = Math.max(a, b);
        int mn = Math.min(a, b);
        for (int i = 1; i <= mx - mn + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mx - j + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}