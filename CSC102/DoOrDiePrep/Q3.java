public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int sw = n - (n % 2 == 0 ? 0 : 1);
        for (int i = 0; i < sw; i += 2) {
            int tmp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = tmp;
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}