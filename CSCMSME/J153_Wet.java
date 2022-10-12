public class J153_Wet {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double r[] = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            r[i] = sc.nextDouble();
        }
        int ans[] = new int[q];
        for (int i = 0; i < q; i++) {
            double xp = sc.nextDouble();
            double yp = sc.nextDouble();
            for (int j = 0; j < n; j++) {
                double dis = Math.sqrt(Math.pow(x[j] - xp, 2) + Math.pow(y[j] - yp, 2));
                if (r[j] >= dis)
                    ans[i]++;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
        sc.close();

    }
}