public class Quiz_1_1_Triangle_Print {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (n - i >= j)
                    System.out.print(" ");
                else if (j <= n)
                    System.out.print((n - j) + 1);
                else if (j <= ((2 * n) - 1) - (n - i))
                    System.out.print(j - n + 1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}