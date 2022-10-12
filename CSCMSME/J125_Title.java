public class J125_Title {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int indx = sc.nextInt();
        for (int i = 0; i < A.length(); i++) {
            if (i == indx) {
                System.out.print("...");
                break;
            }
            System.out.print(A.charAt(i));
        }
        System.out.println();
        sc.close();
    }
}
