/**
 * J124_Competition
 */
public class J124_Competition {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        String A = sc.nextLine();
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        sc.nextLine();
        String B = sc.nextLine();
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        b[2] = sc.nextInt();
        int bwin = 0, awin = 0;
        boolean aper = false, bper = false;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i])
                awin++;
            else if (a[i] < b[i])
                bwin++;
            if (awin == 2 && bwin == 0) {
                aper = true;
                break;
            }
            if (awin == 0 && bwin == 2) {
                bper = true;
                break;
            }
        }
        if (aper || bper) {
            System.out.print("Perfect Win (");
            System.out.print(aper ? A : B);
            System.out.print(")");
        } else if (awin + bwin != 0) {
            System.out.print("Win (");
            System.out.print(awin > bwin ? A : B);
            System.out.print(")");
        } else
            System.out.println("Draw");
        System.out.println();
        sc.close();
    }
}