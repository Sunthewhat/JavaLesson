import java.util.Arrays;

public class Quiz2_1_Bag {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] bag = new int[n];
        for (int i = 0; i < n; i++) {
            bag[i] = sc.nextInt();
        }
        Arrays.sort(bag);

        int len = 10;
        for (int i = 0; i < n; i++) {
            if (i == 0 && bag[0] >= len) {
                while (bag[0] >= len) {
                    System.out.println("0");
                    len *= 10;
                }
            } else {
                System.out.print(bag[i] + " ");
                if (i + 1 != n) {
                    if (bag[i + 1] > len * 10) {
                        System.out.println("\n0");
                        len *= 100;
                    } else if (bag[i + 1] >= len) {
                        System.out.println();
                        len *= 10;
                    }
                }
            }
        }
        if (bag[n - 1] < 1000)
            System.out.println("\n0");
        sc.close();
    }
}