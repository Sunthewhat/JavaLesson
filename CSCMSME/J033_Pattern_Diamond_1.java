public class J033_Pattern_Diamond_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (n * 2) - 1; i++) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j < n - i - 1)
                    System.out.print("-");
                else if (i >= n && j < i - n + 1)
                    System.out.print("-");
                else if (j >= n && j >= n + i)
                    System.out.print("-");
                else if (j >= n && i >= n && j > (2 * n - 3) - (i - n))
                    System.out.print("-");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
