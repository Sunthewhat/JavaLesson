public class J049_CSC102_Quiz_2_2019_Isogram {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String X = sc.nextLine();
        String A = X.toLowerCase();
        int ch = 0;
        int[] chk = new int[30];
        java.util.Arrays.fill(chk, 0);
        for (int i = 0; i < A.length(); i++) {
            // -97
            chk[(A.charAt(i) - 97)]++;
            if (chk[A.charAt(i) - 97] > 1)
                ch = 1;
        }
        if (ch == 0)
            System.out.println(X + " is an isogram");
        else
            System.out.println(X + " is not an isogram");
        sc.close();
    }
}
