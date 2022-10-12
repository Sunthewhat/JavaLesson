import java.util.*;

public class J007_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp0 = 0, temp1 = 1;
        for (int i = 1; i <= n; i++) {
            int tmp = temp0 + temp1;
            if (i == 1)
                System.out.print(temp0);
            else if (i == 2)
                System.out.print(temp1);
            else
                System.out.print(tmp);

            if (i > 2) {
                temp0 = temp1;
                temp1 = tmp;
            }
            if (i < n)
                System.out.print(" ");
        }
        sc.close();
    }
}
