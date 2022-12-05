import java.util.Scanner;

public class J138_Recursive_Logarithm {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(log(a, b));
        sc.close();
    }

    public static int log(int a, int b) {
        if (a == 1)
            return count++;
        log(a / b, b);
        return count++;
    }
}