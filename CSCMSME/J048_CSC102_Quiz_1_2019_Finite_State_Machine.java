/**
 * J048_CSC102_Quiz_1_2019_Finite_State_Machine
 */
public class J048_CSC102_Quiz_1_2019_Finite_State_Machine {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean mur = sc.nextInt() == 1 ? true : false;
        boolean dnd = sc.nextInt() == 1 ? true : false;
        boolean murin = sc.next().charAt(0) == '1' ? true : false;
        boolean dndin = sc.next().charAt(0) == '1' ? true : false;
        if (murin) {
            if (dnd)
                dnd = !dnd;
            mur = !mur;
        }
        if (dndin) {
            if (mur)
                mur = !mur;
            dnd = !dnd;
        }
        if (!dnd && !mur)
            System.out.println("NEUTRAL");
        else if (!dnd && mur)
            System.out.println("MuR");
        else
            System.out.println("DnD");
        sc.close();
    }
}