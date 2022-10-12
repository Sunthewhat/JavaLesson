public class J061_Cut_String_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        int[] cut = new int[26];
        int cnt = 1;
        for (int i = 0; i < A.length(); i++) {
            cut[A.charAt(i) - 'a']++;
            if (cut[A.charAt(i) - 'a'] > 1) {
                cnt++;
                for (int j = 0; j < 26; j++) {
                    if (j != A.charAt(i) - 'a')
                        cut[j] = 0;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
