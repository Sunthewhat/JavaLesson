public class J104_Condo_sale {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int range = sc.nextInt();
        int start = sc.nextInt();
        int n = sc.nextInt();
        int[] demand = new int[n];
        for (int i = 0; i < n; i++) {
            demand[i] = sc.nextInt();
        }
        String a = "";
        int cnt = 0;
        java.util.Arrays.sort(demand);
        for (int i = 0; i < n; i++) {
            if (demand[i] < start || demand[i] > start + range - 1 || (i != 0 && demand[i] == demand[i - 1]))
                continue;
            cnt++;
            a += String.valueOf(demand[i]) + "\n";
        }
        System.out.println(cnt);
        System.out.println(a);
        sc.close();
    }
}
