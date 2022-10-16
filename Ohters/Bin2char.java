public class Bin2char {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        String ans = "";
        int len = A.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                cnt++;
            } else {
                if (A.charAt(i) == A.charAt(i - 1))
                    cnt++;
                else {
                    ans += (char) (cnt + 64);
                    cnt = 1;
                }
            }
        }
        ans += (char) (cnt + 64);
        System.out.println(ans);
        sc.close();
    }
}
// 111111101111111111111111111111111