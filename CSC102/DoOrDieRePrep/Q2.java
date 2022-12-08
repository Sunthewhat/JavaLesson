public class Q2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int tmp = list[p1];
            list[p1] = list[p2];
            list[p2] = tmp;
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}