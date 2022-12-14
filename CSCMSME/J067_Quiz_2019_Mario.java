public class J067_Quiz_2019_Mario {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            if (i % 15 == 0)
                tmp *= 10;
            else if (i % 5 == 0)
                tmp *= 3;
            else if (i % 3 == 0)
                tmp *= 2;
            sum += tmp;
        }
        System.out.println(sum);
        sc.close();
    }
}