public class J036_Pattern_KMUTT {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = (n * 3) + 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j == n && i < m - n)
                    System.out.print("*");
                else if (j == m - n - 1 && i >= n)
                    System.out.print("*");
                else if (i == n && j < m - n - 1)
                    System.out.print("*");
                else if (i == m - n - 1 && j > n)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}
