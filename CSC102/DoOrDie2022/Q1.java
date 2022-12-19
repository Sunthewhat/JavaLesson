public class Q1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.nextLine();
        int len = a.length();
        int sum = 0;
        // System.out.println(len/2);
        // System.out.print(a.charAt(4));
        if ((a.charAt(len / 2) - '0') % 2 == 1) {

            for (int i = 1; i < len; i += 2) {
                sum += a.charAt(i) - '0';
            }
        } else {
            for (int i = 0; i < len; i += 2) {
                sum += a.charAt(i) - '0';
            }
        }
        System.out.println(sum);
        sc.close();
    }
}