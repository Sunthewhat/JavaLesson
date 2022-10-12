public class J110_Jin_and_hisnumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int st = sc.nextInt();
        int en = sc.nextInt();
        int sum = 0;
        for (int i = st; i <= en; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
