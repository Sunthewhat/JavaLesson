public class J095_Average {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        double[] row = new double[n], col = new double[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                row[i] += arr[i][j];
                col[j] += arr[i][j];
            }
        }
        System.out.println("Average of each row:");
        for (double i : row) {
            System.out.printf("%.2f ", i / m);
        }
        System.out.println("\nAverage of each column:");
        for (double i : col) {
            System.out.printf("%.2f ", i / n);
        }
        System.out.println();
        sc.close();
    }
}
