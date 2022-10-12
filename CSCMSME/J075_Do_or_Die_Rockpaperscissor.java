public class J075_Do_or_Die_Rockpaperscissor {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char uk = sc.nextLine().toLowerCase().charAt(0);
        char wr = sc.nextLine().toLowerCase().charAt(0);
        if (uk == 'r') {
            if (wr == 'r')
                System.out.println("Draw");
            if (wr == 'p')
                System.out.println("Dr.Worarat Krathu");
            if (wr == 's')
                System.out.println("Mr.Ukrit Ruckcharti");
        }
        if (uk == 'p') {
            if (wr == 'r')
                System.out.println("Mr.Ukrit Ruckcharti");
            if (wr == 'p')
                System.out.println("Draw");
            if (wr == 's')
                System.out.println("Dr.Worarat Krathu");
        }
        if (uk == 's') {
            if (wr == 'r')
                System.out.println("Dr.Worarat Krathu");
            if (wr == 'p')
                System.out.println("Mr.Ukrit Ruckcharti");
            if (wr == 's')
                System.out.println("Draw");
        }
        sc.close();
    }
}
