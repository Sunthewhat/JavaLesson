public class Magan2 {
    public static void main(String[] args) {

        int[][] mat = new int[10][5];
        int[][] mat2 = new int[10][5];
        int[][] mat3 = new int[5][3];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                double num = (Math.random() * (100 - (-100) + 1) + (-100));
                mat[y][x] = (int) num;
            }
        }
        System.out.println("A = ");
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(mat[y][x] + " ");
            }
            System.out.println();
        }
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                double num = (Math.random() * (100 - (-100) + 1) + (-100));
                mat2[y][x] = (int) num;
            }
        }
        System.out.println();
        System.out.println("B = ");
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(mat2[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 3; x++) {
                double num = (Math.random() * (100 - (-100) + 1) + (-100));
                mat3[y][x] = (int) num;
            }
        }
        System.out.println("C = ");
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(mat3[y][x] + " ");
            }
            System.out.println();
        }
        Mtx mat50 = new Mtx(mat);
        int[][] matsum = mat50.add(mat2);
        System.out.println("\nA+B =");
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(matsum[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println("\n2*B =");
        Mtx mat502 = new Mtx(mat2);
        int[][] matmul = mat502.mul(2);
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(matmul[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println(mat50.compatible(mat2) ? "\nA and B are compatible" : "\nA and B are not compatible");
        mat50.reset(mat);
        int[][] matcross = mat50.mul(mat3);
        System.out.println("\nA*C =");
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(matcross[y][x] + " ");
            }
            System.out.println();
        }
    }
}

class Mtx {
    private int[][] mat50;
    private int[][] mat502 = new int[10][3];

    public Mtx(int[][] x) {
        mat50 = x;
    }

    public boolean equalsize(int[][] x) {
        if (mat50.length == x.length && mat50[0].length == x[0].length) {
            return true;
        } else
            return false;
    }

    public boolean compatible(int[][] x) {
        if (mat50[0].length == x.length) {
            return true;
        } else
            return false;
    }

    public int[][] add(int[][] x) {
        if (this.equalsize(x)) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    mat50[i][j] = mat50[i][j] + x[i][j];
                }
            }
        }
        return mat50;
    }

    public void reset(int[][] x) {
        mat50 = x;
    }

    public int[][] mul(int[][] x) {
        if (this.compatible(x)) {
            int summat = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 5; k++) {
                        summat += mat50[i][k] * x[k][j];
                        // System.out.println(summat);
                    }
                    mat502[i][j] = summat;
                    summat = 0;
                }
            }
        }
        return mat502;
    }

    public int[][] mul(int x) {
        for (int i = 0; i < mat50.length; i++) {
            for (int j = 0; j < mat50[0].length; j++) {
                mat50[i][j] = mat50[i][j] * x;
            }
        }
        return mat50;
    }
}