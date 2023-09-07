public class DNDPQ4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] field = new int[n][m];
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            field[x][y]++;
            if (x - 1 != -1)
                field[x - 1][y]++;
            if (x + 1 != n)
                field[x + 1][y]++;
            if (y - 1 != -1)
                field[x][y - 1]++;
            if (y + 1 != m)
                field[x][y + 1]++;
        }
        for (int[] is : field) {
            for (int js : is) {
                System.out.print(js + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}