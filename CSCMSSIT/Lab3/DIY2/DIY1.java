
/**
 * DIY1
 */
import java.util.*;

public class DIY1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= 5; i++, ++a) {
            if (a % 13 == 0 && i != 0)
                res -= a;
            else
                res += a;
        }
        System.out.println(res);
        sc.close();
    }
}