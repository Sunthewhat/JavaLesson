public class J071_CSC102_Final_1_2019_Binary_number {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50];
        int i;
        sc.close();
        if (n == 0) {
            System.out.println("0");
        }

        else {
            for (i = 0; n > 0; i++) {
                a[i] = n % 2;
                n /= 2;
            }
            for (i = i - 1; i >= 0; i--)
                System.out.print(a[i]);
            System.out.println();
        }
    }
}
