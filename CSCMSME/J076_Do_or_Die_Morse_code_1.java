public class J076_Do_or_Die_Morse_code_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a')
                System.out.print(".- ");
            else if (A.charAt(i) == 'b')
                System.out.print("-... ");
            else if (A.charAt(i) == 'c')
                System.out.print("-.-. ");
            else if (A.charAt(i) == 'd')
                System.out.print("-.. ");
            else if (A.charAt(i) == 'e')
                System.out.print(". ");
            else if (A.charAt(i) == 'f')
                System.out.print("..-. ");
            else if (A.charAt(i) == 'g')
                System.out.print("--. ");
            else if (A.charAt(i) == 'h')
                System.out.print(".... ");
            else if (A.charAt(i) == 'i')
                System.out.print(".. ");
            else if (A.charAt(i) == 'j')
                System.out.print(".--- ");
            else if (A.charAt(i) == 'k')
                System.out.print("-.- ");
            else if (A.charAt(i) == 'l')
                System.out.print(".-.. ");
            else if (A.charAt(i) == 'm')
                System.out.print("-- ");
            else if (A.charAt(i) == 'n')
                System.out.print("-. ");
            else if (A.charAt(i) == 'o')
                System.out.print("--- ");
            else if (A.charAt(i) == 'p')
                System.out.print(".--. ");
            else if (A.charAt(i) == 'q')
                System.out.print("--.- ");
            else if (A.charAt(i) == 'r')
                System.out.print(".-. ");
            else if (A.charAt(i) == 's')
                System.out.print("... ");
            else if (A.charAt(i) == 't')
                System.out.print("- ");
            else if (A.charAt(i) == 'u')
                System.out.print("..- ");
            else if (A.charAt(i) == 'v')
                System.out.print("...- ");
            else if (A.charAt(i) == 'w')
                System.out.print(".-- ");
            else if (A.charAt(i) == 'x')
                System.out.print("-..- ");
            else if (A.charAt(i) == 'y')
                System.out.print("-.-- ");
            else if (A.charAt(i) == 'z')
                System.out.print("--.. ");
            else if (A.charAt(i) == ' ')
                System.out.print("/ ");
        }
        System.out.println();
        sc.close();
    }
}
