public class loopEx {
    public static void main(stringLearn[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 10;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        sc.close();
    }
}
