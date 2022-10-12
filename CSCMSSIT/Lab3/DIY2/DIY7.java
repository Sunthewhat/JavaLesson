import java.util.*;

public class DIY7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split("\\.");
        int ch = 0;
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i]) > 255 || Integer.parseInt(a[i]) < 0)
                ch++;
        }
        if (ch > 0)
            System.out.print("Invalid");
        else
            System.out.print("Valid");
        sc.close();
    }
}