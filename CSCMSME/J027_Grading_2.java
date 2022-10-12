import java.util.Arrays;

public class J027_Grading_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ac[] = a.clone();
        Arrays.sort(ac);
        double Ag = (n + 1) * 90 / 100.00,
                Bg = (n + 1) * 70 / 100.00,
                Cg = (n + 1) * 50 / 100.00,
                Dg = (n + 1) * 30 / 100.00,
                Eg = (n + 1) * 10 / 100.00;
        int AA, BB, CC, DD, EE;
        if (Ag != (int) Ag)
            AA = (int) Ag;
        else
            AA = (int) Ag - 1;
        // AAAAAAAAAAAAAAAA
        if (Bg != (int) Bg)
            BB = (int) Bg;
        else
            BB = (int) Bg - 1;
        // BBBBBBBBBBBBBBBB
        if (Cg != (int) Cg)
            CC = (int) Cg;
        else
            CC = (int) Cg - 1;
        // CCCCCCCCCCCCCCCC
        if (Dg != (int) Dg)
            DD = (int) Dg;
        else
            DD = (int) Dg - 1;
        // DDDDDDDDDDDDDDDD
        if (Eg != (int) Eg)
            EE = (int) Eg;
        else
            EE = (int) Eg - 1;
        // EEEEEEEEEEEEEEEE
        AA = ac[AA];
        BB = ac[BB];
        CC = ac[CC];
        DD = ac[DD];
        EE = ac[EE];
        for (int i = 0; i < n; i++) {
            if (a[i] >= AA)
                System.out.print("A");
            else if (a[i] >= BB)
                System.out.print("B");
            else if (a[i] >= CC)
                System.out.print("C");
            else if (a[i] >= DD)
                System.out.print("D");
            else if (a[i] >= EE)
                System.out.print("E");
            else
                System.out.print("F");
            if (i != n - 1)
                System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}
