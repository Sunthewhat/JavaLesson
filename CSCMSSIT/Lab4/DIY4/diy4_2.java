public class diy4_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        boolean ch = true;
        for (int i = 0; i < n; i++) {
            int tmp = sum;
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            if (i != 0) {
                if (sum != tmp)
                    ch = false;
            }
        }
        System.out.println(ch);
        sc.close();
    }
}