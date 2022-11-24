public class J045_Encrypt_Code {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        int[] ar = new int[30];
        for (int i = 0; i < A.length(); i++) {
            // 97
            ar[A.charAt(i) - 97]++;
        }
        for (int i = 0; i < A.length(); i++) {
            if (ar[A.charAt(i) - 97] > 1)
                System.out.print("-");
            else
                System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}