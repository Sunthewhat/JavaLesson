public class Drinking {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char Person = sc.next().charAt(0);
        int round = sc.nextInt();
        int peridx = 0;
        for (int i = 1; round > 0; i++) {
            peridx = 0;
            round -= i;
            if (round <= 0)
                break;
            peridx = 1;
            round -= i;
            if (round <= 0)
                break;
        }
        if (peridx == 0) {
            System.out.println(Person);
        } else {
            if (Person == 'A')
                System.out.println("B");
            else
                System.out.println("A");
        }
        sc.close();
    }
}