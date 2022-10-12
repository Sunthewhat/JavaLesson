import java.util.*;

public class J020_Pattern_Mountain {
    public static void sout(int hight, int wide, String field[][]) {
        for (int i = hight-1; i >= 0; i--) {
        //for (int i = 0; i < hight; i++) {
            for (int j = 0; j < wide; j++) {
                if (field[i][j]==null) System.out.print("-");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = -10, wide = 0;
        int[] H = new int[n + 5];
        for (int i = 0; i < n; i++) {
            H[i] = sc.nextInt();
            mx = Math.max(H[i], mx);
            wide += (H[i] * 2) - 1;
        }
        int hight = mx;
        String[][] field = new String[hight+10][wide+10];
        int indx = 0;
        for (int k = 0; k < n; k++) {
            int tempH = H[k];
            int tempW = (tempH*2)-1;
            for (int i = 0; i < tempH; i++) {
                for (int j = 0; j < tempW; j++) {
                    if (j>=i && j<tempH) field[i][indx+j]="*";
                    else if (j<tempW-i&&j>=tempH) field[i][indx+j]="*";
                }
            }
            indx+=(H[k]*2)-1;
        }
        sout(hight, wide, field);
        sc.close();
    }
}
