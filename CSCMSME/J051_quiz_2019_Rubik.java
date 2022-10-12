public class J051_quiz_2019_Rubik {
    public static int[][][] rubik = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
            { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
            { { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

    public static void up(int j) {
        for (int i = 0; i < 2; i++) {
            int tmp = rubik[0][0][j];
            rubik[0][0][j] = rubik[0][1][j];
            rubik[0][1][j] = rubik[0][2][j];
            rubik[0][2][j] = rubik[1][2][j];
            rubik[1][2][j] = rubik[2][2][j];
            rubik[2][2][j] = rubik[2][1][j];
            rubik[2][1][j] = rubik[2][0][j];
            rubik[2][0][j] = rubik[1][0][j];
            rubik[1][0][j] = tmp;
        }
    }

    public static void down(int j) {
        for (int i = 0; i < 2; i++) {
            int tmp = rubik[0][0][j];
            rubik[0][0][j] = rubik[1][0][j];
            rubik[1][0][j] = rubik[2][0][j];
            rubik[2][0][j] = rubik[2][1][j];
            rubik[2][1][j] = rubik[2][2][j];
            rubik[2][2][j] = rubik[1][2][j];
            rubik[1][2][j] = rubik[0][2][j];
            rubik[0][2][j] = rubik[0][1][j];
            rubik[0][1][j] = tmp;
        }
    }

    public static void left(int i) {
        for (int j = 0; j < 2; j++) {
            int tmp = rubik[0][i][0];
            rubik[0][i][0] = rubik[0][i][1];
            rubik[0][i][1] = rubik[0][i][2];
            rubik[0][i][2] = rubik[1][i][2];
            rubik[1][i][2] = rubik[2][i][2];
            rubik[2][i][2] = rubik[2][i][1];
            rubik[2][i][1] = rubik[2][i][0];
            rubik[2][i][0] = rubik[1][i][0];
            rubik[1][i][0] = tmp;
        }
    }

    public static void right(int i) {
        for (int j = 0; j < 2; j++) {
            int tmp = rubik[0][i][0];
            rubik[0][i][0] = rubik[1][i][0];
            rubik[1][i][0] = rubik[2][i][0];
            rubik[2][i][0] = rubik[2][i][1];
            rubik[2][i][1] = rubik[2][i][2];
            rubik[2][i][2] = rubik[1][i][2];
            rubik[1][i][2] = rubik[0][i][2];
            rubik[0][i][2] = rubik[0][i][1];
            rubik[0][i][1] = tmp;
        }

    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // rubik[k][i][j]
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            char method = sc.next().charAt(0);
            int index = sc.nextInt();
            switch (method) {
                case 'u':
                    up(index);
                    break;
                case 'd':
                    down(index);
                    break;
                case 'l':
                    left(index);
                    break;
                case 'r':
                    right(index);
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rubik[0][i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}