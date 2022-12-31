public class arrays_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int field[][] = new int[n][m];
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int ii = sc.nextInt();
            int jj = sc.nextInt();
            field[ii][jj]++;
        }
        for (int[] fs : field) {
            for (int fss : fs) {
                System.out.print(fss);
            }
            System.out.println();
        }
        sc.close();
    }
}