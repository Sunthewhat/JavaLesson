public class J034_Pattern_Rectangle_5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)
                    System.out.print("*");
                else if (j == 0 || j == n - 1)
                    System.out.print("*");
                else if (j == i)
                    System.out.print("*");
                else if (j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}
