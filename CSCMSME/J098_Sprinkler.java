/**
 * J098_Sprinkler
 */
public class J098_Sprinkler {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] field = new int[n][m];
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            st[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (st[i].charAt(j) == 'S') {
                    for (int k = i; k < n; k++) {
                        if (st[k].charAt(j) == 'X')
                            break;
                        field[k][j]++;
                    }
                    for (int k = i; k >= 0; k--) {
                        if (st[k].charAt(j) == 'X')
                            break;
                        field[k][j]++;
                    }
                    for (int k = j; k < m; k++) {
                        if (st[i].charAt(k) == 'X')
                            break;
                        field[i][k]++;
                    }
                    for (int k = j; k >= 0; k--) {
                        if (st[i].charAt(k) == 'X')
                            break;
                        field[i][k]++;
                    }
                    field[i][j] -= 3;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}