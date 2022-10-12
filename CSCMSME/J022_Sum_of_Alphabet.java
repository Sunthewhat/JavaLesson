/**
 * J022_Sum_of_Alphabet
 */
import java.util.*;
public class J022_Sum_of_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        int Res = 0, len = A.length();
        for (int i = 0; i < len; i++) {
            //-96
            if (A.charAt(i)<97 || A.charAt(i)>122) continue;
            Res += (A.charAt(i)-96)-i;
        }
        System.out.println(Res);
        sc.close();
    }
    
}