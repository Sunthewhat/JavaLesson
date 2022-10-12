public class diy4_3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int hour = sc.nextInt() == 1 ? 6 : 0;
        for (int i = 0; i < 6; i++) {
            hour += sc.nextInt() == 1 ? 1 : 0;
        }
        int mins = 0;
        for (int i = 0; i < 9; i++) {
            mins += sc.nextInt() == 1 ? 1 : 0;
        }
        for (int i = 1; i <= 3; i++) {
            mins += sc.nextInt() == 1 ? 10 * i : 0;
        }
        System.out.println(hour + ":" + mins);
        sc.close();
    }
}