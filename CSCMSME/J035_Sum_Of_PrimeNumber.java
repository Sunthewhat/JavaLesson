/**
 * J035_Sum_Of_PrimeNumber
 */
public class J035_Sum_Of_PrimeNumber {

    public static boolean Primecheck(int n) {
        int flag = 0;
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        if (n == 2)
            return true;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 1)
                return false;
            else
                return true;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;
        int mn = Math.min(a, b), mx = Math.max(a, b);
        for (int i = mn; i < mx; i++) {
            if (Primecheck(i))
                sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}