public class J090_SubsetSum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] set = new int[n];
        for (int i = 0; i < n; i++)
            set[i] = sc.nextInt();
        int q = sc.nextInt();
        int[] query = new int[q];
        for (int i = 0; i < q; i++)
            query[i] = sc.nextInt();
        for (int qq : query) {
            if (subsetSum(set, 0, 0, qq))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }

    public static boolean subsetSum(int[] set, int idx, int sum, int expeted) {
        if (sum > expeted)
            return false;
        if (sum == expeted)
            return true;
        if (idx == set.length)
            return false;
        return subsetSum(set, idx + 1, sum + set[idx], expeted) || subsetSum(set, idx + 1, sum, expeted);
    }
}
