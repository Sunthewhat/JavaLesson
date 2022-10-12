public class J059_Raining_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int bucket = 0;
        int[] start_range = new int[q], end_range = new int[q];
        for (int i = 0; i < q; i++) {
            start_range[i] = sc.nextInt() - 1;
            end_range[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            bucket = 0;
            for (int j = 0; j < q; j++) {
                if (i >= start_range[j] && i <= end_range[j])
                    bucket++;
            }
            System.out.print(bucket + " ");
        }
        System.out.println();
        sc.close();
    }
}