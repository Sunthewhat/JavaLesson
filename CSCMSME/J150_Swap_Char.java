public class J150_Swap_Char {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        char[] Arr = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            Arr[i] = A.charAt(i);
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            if (one < 0 || two < 0 || one >= A.length() || two >= A.length())
                continue;
            char tmp = Arr[one];
            Arr[one] = Arr[two];
            Arr[two] = tmp;
        }
        for (char c : Arr) {
            System.out.print(c);
        }
        System.out.println();
        sc.close();
    }
}
