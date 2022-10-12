public class J053_Airplane {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int person[] = new int[n];
        int seat[][] = new int[n][2];
        for (int i = 0; i < n * 2; i++) {
            person[i] = sc.nextInt();
        }
        sc.close();
    }
}
