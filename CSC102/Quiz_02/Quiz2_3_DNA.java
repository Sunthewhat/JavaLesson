import java.util.Scanner;

public class Quiz2_3_DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sp = { "", " ", "  ", "   ", "  ", " ", "" };
        int spdig = 0;
        String DNA = sc.nextLine();
        int len = DNA.length();
        for (int i = 0; i < len; i++) {
            System.out.print(sp[spdig]);
            spdig++;
            if (DNA.charAt(i) == 'A')
                System.out.println("A - - T");
            else if (DNA.charAt(i) == 'T')
                System.out.println("T - - A");
            else if (DNA.charAt(i) == 'G')
                System.out.println("G - - C");
            else if (DNA.charAt(i) == 'C')
                System.out.println("C - - G");
            if (spdig == 7)
                spdig = 0;
        }
        sc.close();
    }
}