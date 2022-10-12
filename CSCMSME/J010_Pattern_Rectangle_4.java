import java.util.*;

public class J010_Pattern_Rectangle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == n - 1 || i == 0) || (j == 0 || j == m - 1))
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        sc.close();
    }
}
