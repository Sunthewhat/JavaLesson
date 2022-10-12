/**
 * J052_CSC102_Quiz_2_2019_Text_inside_out
 */
public class J052_CSC102_Quiz_2_2019_Text_inside_out {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if (len % 2 == 0) {
            for (int i = len / 2 - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            for (int i = len - 1; i >= len / 2; i--) {
                System.out.print(str.charAt(i));
            }
        } else {
            for (int i = len / 2 - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.print(str.charAt(len / 2));
            for (int i = len - 1; i > len / 2; i--) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        sc.close();
    }
}