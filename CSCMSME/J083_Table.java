public class J083_Table {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt() + 1;
        int n = sc.nextInt() * 2 + 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(i == 0 ? "*" : "|");
                } else
                    System.out.print("_");
            }
            System.out.println();
        }
        sc.close();
    }
}