public class J144_Word_Count {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        String B = sc.nextLine().toLowerCase();
        int len = B.length();
        int sum = 0;
        sc.close();
        for (int i = 0; i < A.length(); i++) {
            if (i + len > A.length())
                continue;
            if (!A.substring(i, i + len).equals(B))
                continue;
            else {
                sum++;
                i += len - 1;
            }

        }
        System.out.println(sum);
    }
}