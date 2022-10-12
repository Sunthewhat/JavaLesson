import java.util.*;

public class DIY6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//INPUT
        int len = a.length();
        int cnt = 0, ch = 0;
        for (int i = 0; i < len; i += 3) {
            if (a.substring(i, i + 3).equals("ATG")) {//START CODON
                ch = 1;
                cnt++;
            }
            else if (a.substring(i, i + 3).equals("TGA") || a.substring(i, i + 3).equals("TAA")
            || a.substring(i, i + 3).equals("TAG")) {
                ch = 0;
            }
            else if (ch == 1) {
                cnt++;
            }
            else
                continue;
        }
        System.out.print(cnt);
        sc.close();
    }
}