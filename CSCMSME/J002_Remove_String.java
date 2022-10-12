import java.util.*;

public class J002_Remove_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int alen = a.length(), blen = b.length();
        if (alen > blen)
            System.out.print(a = a.replace(b, ""));
        else
            System.out.print(b = b.replace(a, ""));
        sc.close();
    }
}
