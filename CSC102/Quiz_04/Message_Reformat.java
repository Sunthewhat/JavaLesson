import java.util.*;

public class Message_Reformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (i == 0) {
                System.out.print(a.toUpperCase().charAt(i));
            } else if (a.charAt(i) == ';') {
                System.out.print(" ");
            } else if (a.charAt(i - 1) == ';') {
                System.out.print(a.toUpperCase().charAt(i));
            } else
                System.out.print(a.charAt(i));
        }
        sc.close();
    }
}