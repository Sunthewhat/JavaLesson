public class Q1Mew {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        int sum = 0;
        for (int i = a[4] % 2; i < a.length; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}