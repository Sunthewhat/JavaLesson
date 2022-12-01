import java.util.Scanner;

public class J137_Recursive_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numString(n));
        sc.close();
    }

    public static String numString(int n) {
        if (n == 1) {
            System.out.print(n);
            return "";
        }
        for (int i = 0; i < n; i++) {
            System.out.print(n);
        }
        numString(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(n);
        }
        return "";
    }
}