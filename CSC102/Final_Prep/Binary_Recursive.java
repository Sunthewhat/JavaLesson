public class Binary_Recursive {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        bin_convert(n);
        System.out.println();
        sc.close();
    }

    public static void bin_convert(int n) {
        System.out.println("N = " + n);
        if (n == 1) {
            System.out.print("1");
            return;
        }
        bin_convert(n / 2);
        System.out.print(n % 2);
        return;
    }
}
/*
 * 10 0
 * 5 1
 * 2 0
 * 1
 */
