public class J140_Hello_CS {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String a;
        for (int i = 0; i < n; i++) {
            a = sc.next();
            if (i % 2 == 0)
                System.out.print(a + " ");
            else {
                for (int j = a.length() - 1; j >= 0; j--) {
                    System.out.print(a.charAt(j));
                }
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
