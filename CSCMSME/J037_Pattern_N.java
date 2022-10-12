public class J037_Pattern_N {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1)
                    System.out.print("*");
                else if (j == i)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}
