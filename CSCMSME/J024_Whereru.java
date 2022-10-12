import java.util.*;
public class J024_Whereru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        String B = sc.nextLine().toLowerCase();
        String C = "";
        int ch=0;
        int len = A.length();
        for (int i = 0; i < len; i++) {
            if (A.charAt(i)==B.charAt(0)) {
                if (ch!=0) C += ", ";
                C += i;
                ch++;
            }
        }
        if (ch==0) System.out.print("ERROR");
        else {
            System.out.println(ch);
            System.out.print(C);
        }
        System.out.println();
        sc.close();
    }
}

