public class Q2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = i % 2 == 0 ? sc.next().toUpperCase() : sc.next().toLowerCase();
            for (int j = a[i].length() - 1; j >= 0; j--) {
                System.out.print(a[i].charAt(j));
            }
            System.out.print(" ");
        }
        sc.close();
    }
}