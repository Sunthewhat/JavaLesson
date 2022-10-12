public class J143_Sentence_Review {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length();
        long sum = 0;
        boolean[] ch = new boolean[200];
        for (int i = 0; i < len; i++) {
            if (!((A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') || (A.charAt(i) >= 'a' && A.charAt(i) <= 'z')))
                continue;
            if (ch[A.charAt(i)])
                continue;
            sum += A.charAt(i);
            ch[A.charAt(i)] = true;
        }
        sum = sum * sum;
        sum %= len;
        System.out.println(sum + "/10");
        sc.close();
    }
}
