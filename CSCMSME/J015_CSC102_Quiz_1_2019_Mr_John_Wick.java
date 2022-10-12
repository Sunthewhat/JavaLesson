import java.util.*;

public class J015_CSC102_Quiz_1_2019_Mr_John_Wick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Fortune = { "", "Purple", "Orange", "Black, Brown, Gray", "Red", "Pink", "Blue, Baby Blue", "Green" };
        String[] Unfortune = { "", "Red", "Yellow, White", "Pink", "Purple", "Black, Blue, Gray", "Green",
                "Blue, Baby Blue" };
        String day = sc.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("Fortune : " + Fortune[1]);
                System.out.println("Unfortunate : " + Unfortune[1]);
                break;
            case "Tuesday":
                System.out.println("Fortune : " + Fortune[2]);
                System.out.println("Unfortunate : " + Unfortune[2]);
                break;
            case "Wednesday":
                System.out.println("Fortune : " + Fortune[3]);
                System.out.println("Unfortunate : " + Unfortune[3]);
                break;
            case "Thursday":
                System.out.println("Fortune : " + Fortune[4]);
                System.out.println("Unfortunate : " + Unfortune[4]);
                break;
            case "Friday":
                System.out.println("Fortune : " + Fortune[5]);
                System.out.println("Unfortunate : " + Unfortune[5]);
                break;
            case "Saturday":
                System.out.println("Fortune : " + Fortune[6]);
                System.out.println("Unfortunate : " + Unfortune[6]);
                break;
            case "Sunday":
                System.out.println("Fortune : " + Fortune[7]);
                System.out.println("Unfortunate : " + Unfortune[7]);
                break;

            default:
                System.out.println("Input is invalid");
                break;
        }
        sc.close();
    }
}
