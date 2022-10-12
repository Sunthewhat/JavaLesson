public class J029_Every_N {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < a.length(); i += n) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        sc.close();
    }
}