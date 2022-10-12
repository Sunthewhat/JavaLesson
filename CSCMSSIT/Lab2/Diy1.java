import java.util.*;

public class Diy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        String Sur = sc.next();
        String Age = sc.next();
        String Prog = sc.next();
        System.out.println("My name is " + Name + " " + Sur + ".");
        System.out.println("I'm " + Age + " year old.");
        System.out.println("I'm studying " + Prog);
        sc.close();
    }
}
