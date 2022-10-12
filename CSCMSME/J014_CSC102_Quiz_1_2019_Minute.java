import java.util.*;

public class J014_CSC102_Quiz_1_2019_Minute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(a / 60 / 24 / 365 + " " + a / 60 / 24 % 365);
        sc.close();
    }
}
