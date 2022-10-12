public class J113_Springkler {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] field = new int[n][m];
        int[] dpcol = new int[m], dprow = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                field[i][j] = sc.nextInt();
                dpcol[j] += field[i][j];
                dprow[i] += field[i][j];
            }
        }
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, dpcol[j] + dprow[i] - field[i][j]);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
