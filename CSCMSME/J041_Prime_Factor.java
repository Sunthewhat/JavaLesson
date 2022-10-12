public class J041_Prime_Factor {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    if (cnt > 0)
                        System.out.print(" x ");
                    System.out.print(i);
                    cnt++;
                    n /= i;
                    break;
                }
            }
        }
        System.out.println();
        sc.close();
    }
}
