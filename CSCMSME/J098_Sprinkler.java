public class J098_Sprinkler {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] field = new String[n + 10];
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            field[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i].charAt(j) == 'S') {
                    for (int k = i; k < n && field[k].charAt(j) != 'X'; k++) {// down
                        ans[k][j]++;
                    }
                    for (int k = i; k >= 0 && field[k].charAt(j) != 'X'; k--) {// up
                        ans[k][j]++;
                    }
                    for (int k = j; k < m && field[i].charAt(k) != 'X'; k++) {// right
                        ans[i][k]++;
                    }
                    for (int k = j; k >= 0 && field[i].charAt(k) != 'X'; k--) {// left
                        ans[i][k]++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
