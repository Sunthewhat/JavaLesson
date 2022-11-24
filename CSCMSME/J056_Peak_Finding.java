import java.util.*;

public class J056_Peak_Finding {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        int[] N = new int[q];
        int[] peak = new int[q];
        int cnt = 0;
        for (int i = 0; i < q; i++) {
            N[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            if (i == 0) {
                if (N[i] > N[i + 1]) {
                    peak[cnt++] = N[i];
                }
            } else if (i == q - 1) {
                if (N[i] > N[i - 1]) {
                    peak[cnt++] = N[i];
                }
            } else if (N[i] > N[i - 1] && N[i] > N[i + 1]) {
                peak[cnt++] = N[i];
            }
        }
        System.out.println(cnt);
        Arrays.sort(peak);
        for (int i : peak) {
            if (i == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}