import java.util.*;

public class equalsignore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.equalsIgnoreCase(b) ? "equal" : "not equal");
        sc.close();
    }
}
