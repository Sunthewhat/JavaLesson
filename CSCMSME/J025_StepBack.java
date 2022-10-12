public class J025_StepBack {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mx = Math.max(a, b), mn = Math.min(a, b);
        for (int i = 1; i <= mx - mn + 1; i++) {
            int j = 0;
            int temp = i;
            while (temp>0) {
                System.out.print(mx-j);
                if (mx-j!=mn) System.out.print(" ");
                j++;
                temp--;
            }
        }
        System.out.println();
        sc.close();
    }
}