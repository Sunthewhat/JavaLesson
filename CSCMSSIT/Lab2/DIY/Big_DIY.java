import java.util.Scanner;

public class Big_DIY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        String Surname = sc.next();
        String Age = sc.next();
        String StuProg = sc.next();
        System.out.println("My name is " + Name + Surname + ".");
        System.out.println("I'm " + Age + "years old.");
        System.out.println("I'm studying " + StuProg + ".");
        sc.close();
    }
}
