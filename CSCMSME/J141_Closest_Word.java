public class J141_Closest_Word {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        int[] Aletter = new int[27];
        for (int i = 0; i < A.length(); i++) { // 96
            Aletter[A.charAt(i) - 96]++;
        }
        String ans = "";
        int q = sc.nextInt();
        int mxscore = 0;
        for (int m = 0; m < q; m++) {
            int tmpscore = 0;
            String B = sc.next();
            String Bans = B;
            B = B.toLowerCase();
            for (int i = 0; i < B.length(); i++) {
                tmpscore += Aletter[B.charAt(i) - 96];
            }
            if (m == 0) {
                mxscore = tmpscore;
                ans = Bans;
            } else if (tmpscore >= mxscore) {
                mxscore = tmpscore;
                ans = Bans;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
