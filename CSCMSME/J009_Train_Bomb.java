import java.util.*;

public class J009_Train_Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bomb = sc.nextInt();
        if (n == 3 && bomb == 2) {
            System.out.println("DIE");
        }
        if (n <= 2)
            System.out.print("DIE");
        else {
            for (int i = 1; i <= n; i++) {
                if (i == bomb || i == bomb + 1 || i == bomb - 1)
                    continue;
                System.out.print(i);
                if (i != n)
                    System.out.print(" ");
            }
        }
        sc.close();
    }
}
