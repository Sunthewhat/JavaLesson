import java.util.Scanner;

public class Quiz2_2_Hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int sum = 0;
        int len = a.length() - 1;
        for (int i = 0; i < len; i += 2) {
            sum += Integer.valueOf(a.substring(i, i + 2), 16);
        }
        System.out.println(sum);
        sc.close();
    }
}