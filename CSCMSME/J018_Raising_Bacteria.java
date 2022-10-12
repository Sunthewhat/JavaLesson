import java.util.*;

public class J018_Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                n--;
                tmp++;
            }
            n /= 2;
        }
        System.out.println(tmp);
        sc.close();
    }
}
