public class Matrinx_Multiplication {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int mat1[][] = new int[row1][col1];
        int mat2[][] = new int[row2][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        if (col1 != row2)
            System.out.println("Invalid");
        else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    int res = 0;
                    for (int ii = 0; ii < col1; ii++) {
                        res += mat1[i][ii] * mat2[ii][j];
                    }
                    System.out.print(res + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}