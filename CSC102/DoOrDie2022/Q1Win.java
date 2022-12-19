import java.util.Scanner;

public class Q1Win {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int dig = 8;
        int[] numm = new int[9];
        numm[0] = num / 100000000 % 10;
        numm[1] = num / 10000000 % 10;
        numm[2] = num / 1000000 % 10;
        numm[3] = num / 100000 % 10;
        numm[4] = num / 10000 % 10;
        numm[5] = num / 1000 % 10;
        numm[6] = num / 100 % 10;
        numm[7] = num / 10 % 10;
        numm[8] = num / 1 % 10;
        if (numm[4] % 2 == 0) {
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    res += numm[i];
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                if (i % 2 != 0) {
                    res += numm[i];
                }
            }
        }
        System.out.print(res);
    }
}