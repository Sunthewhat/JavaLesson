public class J079_1D_Array {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000000, max = -1000000000, sum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            min = Math.min(k, min);
            max = Math.max(k, max);
            sum += k;
        }
        double avg = (double) sum / n;
        System.out.println("Summation: " + sum + ".00");
        System.out.print("Average: ");
        System.out.printf("%.2f", avg);
        System.out.println("\nMax: " + max + ".00");
        System.out.println("Min: " + min + ".00");
        sc.close();
    }
}