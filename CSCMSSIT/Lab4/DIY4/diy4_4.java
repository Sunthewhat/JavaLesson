/**
 * diy4_4
 */
public class diy4_4 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.next().charAt(0);
            }
        }
        int q = sc.nextInt();
        String[] word = new String[q];
        boolean[] result = new boolean[q];
        for (int i = 0; i < q; i++) {
            word[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String vert = "", revert = "", horiz = "", rehoriz = "", leftdiag = "", releftdiag = "", rightdiag = "",
                        rerightdiag = "";
                for (int k = i; k >= 0; k--) {
                    vert += a[k][j];
                }
                for (int k = i; k < n; k++) {
                    revert += a[k][j];
                }
                for (int k = j; k >= 0; k--) {
                    horiz += a[i][k];
                }
                for (int k = j; k < m; k++) {
                    rehoriz += a[i][k];
                }
                for (int k = 0; i - k >= 0 && j - k >= 0; k++) {
                    leftdiag += a[i - k][j - k];
                }
                for (int k = 0; i + k < n && j + k < m; k++) {
                    releftdiag += a[i + k][j + k];
                }
                for (int k = 0; i - k >= 0 && j + k < m; k++) {
                    rightdiag += a[i - k][j + k];
                }
                for (int k = 0; i + k < n && j - k >= 0; k++) {
                    rerightdiag += a[i + k][j - k];
                }
                for (int k = 0; k < q; k++) {
                    if (vert.contains(word[k]))
                        result[k] = true;
                    if (revert.contains(word[k]))
                        result[k] = true;
                    if (horiz.contains(word[k]))
                        result[k] = true;
                    if (rehoriz.contains(word[k]))
                        result[k] = true;
                    if (leftdiag.contains(word[k]))
                        result[k] = true;
                    if (releftdiag.contains(word[k]))
                        result[k] = true;
                    if (rightdiag.contains(word[k]))
                        result[k] = true;
                    if (rerightdiag.contains(word[k]))
                        result[k] = true;
                }

            }
        }
        for (int i = 0; i < q; i++) {
            if (result[i])
                System.out.println(word[i] + " found");
            else
                System.out.println(word[i] + " not found");
        }
        sc.close();
    }
}