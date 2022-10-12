public class J093_Reverse_String {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = a[i].length() - 1; j >= 0; j--) {
                if (j == a[i].length() - 1)
                    a[i] = a[i].toUpperCase();
                else
                    a[i] = a[i].toLowerCase();
                System.out.print(a[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}