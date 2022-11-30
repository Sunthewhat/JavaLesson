public class J084_Permutation {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int word1[] = new int[150];
            int word2[] = new int[150];
            String w1 = sc.next();
            String w2 = sc.next();
            for (int j = 0; j < w1.length(); j++) {
                word1[w1.charAt(j)]++;
            }
            for (int j = 0; j < w2.length(); j++) {
                word2[w2.charAt(j)]++;
            }
            boolean ch = true;
            for (int j = 0; j < 150; j++) {
                if (word1[j] != word2[j])
                    ch = false;
            }
            System.out.println(ch ? "Yes" : "No");
        }
        sc.close();
    }
}