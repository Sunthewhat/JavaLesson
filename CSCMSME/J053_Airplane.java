public class J053_Airplane {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[][] seat = new int[n][2];
        for (int i = 0; i < n * 2; i++) {
            int weight = sc.nextInt();
            int lessWeight = lessWeight(seat);
            if (!isFull(seat, lessWeight)) {
                int j;
                for (j = 0; seat[j][lessWeight] != 0; j++)
                    ;
                seat[j][lessWeight] = weight;
            } else {
                int lowestJ = n - 1;
                for (int j = n - 1; j >= 0; j--) {
                    if (seat[j][lessWeight] < seat[lowestJ][lessWeight]) {
                        lowestJ = j;
                    }
                }
                int tmp = seat[lowestJ][lessWeight];
                seat[lowestJ][lessWeight] = weight;
                int j;
                for (j = 0; seat[j][lessWeight == 0 ? 1 : 0] != 0; j++)
                    ;
                seat[j][lessWeight == 0 ? 1 : 0] = tmp;
            }
        }
        for (int[] i : seat) {
            System.out.println(i[0] + " " + i[1]);
        }
        sc.close();
    }

    public static int lessWeight(int[][] seat) {
        int weightLeft = 0;
        for (int i = 0; i < seat.length; i++) {
            weightLeft += seat[i][0];
        }
        int weightRight = 0;
        for (int i = 0; i < seat.length; i++) {
            weightRight += seat[i][1];
        }
        return weightLeft <= weightRight ? 0 : 1;
    }

    public static boolean isFull(int[][] seat, int side) {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i][side] == 0) {
                return false;
            }
        }
        return true;
    }
}
