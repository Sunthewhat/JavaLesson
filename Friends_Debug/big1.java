import java.util.*;

public class big1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().toLowerCase();
        String m = sc.nextLine().toLowerCase();
        int count = 0;
        for (int j = 0; j < n.length(); j++) {

            if (j + m.length() - 1 >= n.length()) {
                break;
            } // Prevent index out of bound

            if (m.equals(n.substring(j, j + m.length()))) {
                count++;
                j += m.length() - 1;// Skip founded word
            }
        }
        System.out.println(count);
        sc.close();
    }
}