import java.util.*;
public class J023_Grading_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //90 80 60 50
        if (score>=90) System.out.println("A");
        else if (score>=80) System.out.println("B");
        else if (score>=60) System.out.println("C");
        else if (score>=50) System.out.println("D");
        else System.out.println("F");
        sc.close();
    }
}
