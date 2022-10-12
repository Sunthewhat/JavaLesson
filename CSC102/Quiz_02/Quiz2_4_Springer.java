import java.util.Scanner;

public class Quiz2_4_Springer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean placeable = false;
        int max = 0, imax = 0, jmax = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0)
                    placeable = true;
            }
        }
        if (!placeable)
            System.out.println("cannot place springer");
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 0) {
                        int sum = 0;
                        if (i - 1 >= 0 && j - 1 >= 0)
                            sum += a[i - 1][j - 1];
                        if (i - 1 >= 0)
                            sum += a[i - 1][j];
                        if (i - 1 >= 0 && j + 1 < m)
                            sum += a[i - 1][j + 1];
                        if (j - 1 >= 0)
                            sum += a[i][j - 1];
                        if (j + 1 < m)
                            sum += a[i][j + 1];
                        if (j - 1 >= 0 && i + 1 < n)
                            sum += a[i + 1][j - 1];
                        if (i + 1 < n)
                            sum += a[i + 1][j];
                        if (i + 1 < n && j + 1 < m)
                            sum += a[i + 1][j + 1];
                        if (sum > max) {
                            max = sum;
                            imax = i;
                            jmax = j;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == imax && j == jmax)
                        System.out.print("x ");
                    else
                        System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}