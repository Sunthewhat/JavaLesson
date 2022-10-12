import java.util.Arrays;

public class J043_Coin {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        String[] nnum = A.split(" ");
        long[] Num = new long[nnum.length];
        for (int i = 0; i < nnum.length; i++)
            Num[i] = Long.parseLong(nnum[i]);
        Arrays.sort(Num);
        int med = (Num.length / 2);
        long sum = 0;
        for (int i = 0; i < Num.length; i++) {
            sum += Math.abs(Num[med] - Num[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
