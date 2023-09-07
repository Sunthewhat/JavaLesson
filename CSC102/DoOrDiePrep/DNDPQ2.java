import java.util.*;

public class DNDPQ2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next().toUpperCase();
            char[] b = a.toCharArray();
            Arrays.sort(b);
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}