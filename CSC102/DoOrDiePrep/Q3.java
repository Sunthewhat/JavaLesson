public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        for (int i = 0; i < n - n % 2; i += 2) {
            System.out.print(list[i + 1] + " " + list[i] + " ");
        }
        if (n % 2 == 1)
            System.out.print(list[n - 1]);
        System.out.println();
        sc.close();
    }
}