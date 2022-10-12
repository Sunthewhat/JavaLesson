public class diy4_3_Easysol {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int hour = 0;
        for (int i = 0; i <= 6; i++) { // First row represent hours
            int tmp = sc.nextInt();
            if (i == 0 && tmp == 1)
                hour += 6; // first digit is 6hour indicator
            else if (tmp == 1)
                hour += 1; // other 6 is 1 hour indicator
        }
        int mins = 0;
        for (int i = 0; i < 9; i++) { // Second row represent minutes
            int tmp = sc.nextInt();
            if (tmp == 1)
                mins += 1;
        }
        for (int i = 1; i <= 3; i++) { // Last row represent 10,20 and 30 minutes
            int tmp = sc.nextInt();
            if (tmp == 1)
                mins += i * 10;
            // Ex second light of this row is on we have to add minutes by 20 or i*10;i=2
        }
        System.out.println(hour + ":" + mins);
        sc.close();
    }
}