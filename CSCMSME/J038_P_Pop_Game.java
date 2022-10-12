import java.util.Arrays;

public class J038_P_Pop_Game {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] Distance = new int[n], Tmp = new int[n];
        for (int i = 0; i < n; i++)
            Distance[i] = sc.nextInt();
        Tmp = Distance.clone();
        Arrays.sort(Tmp);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Tmp[i] == Distance[j]) {
                    System.out.print(j + 1 + " ");
                    Distance[j] = -1;
                    break;
                }
            }
        }
        System.out.println();
        sc.close();
    }
}