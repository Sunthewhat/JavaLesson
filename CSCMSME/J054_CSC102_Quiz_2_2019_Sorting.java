import java.util.*;

public class J054_CSC102_Quiz_2_2019_Sorting {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        int[] ar = new int[q];
        for (int i = 0; i < q; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int len = ar.length % 2 == 0 ? ar.length / 2 : ar.length / 2 + 1;
        for (int i = 0; i < len; i++) {
            if (ar.length - i - 1 == i)
                System.out.print(ar[i]);
            else
                System.out.print(ar[ar.length - i - 1] + " " + ar[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
