public class J069_Quiz_2019_RNA {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length();
        int leu = 0, pro = 0, his = 0, gin = 0, arg = 0;
        for (int i = 0; i < len; i += 3) {
            String N = A.substring(i, i + 3);
            if (N.equals("CUU") || N.equals("CUC") || N.equals("CUA") || N.equals("CUG"))
                leu++;
            else if (N.equals("CCU") || N.equals("CCC") || N.equals("CCA") || N.equals("CCG"))
                pro++;
            else if (N.equals("CAU") || N.equals("CAC"))
                his++;
            else if (N.equals("CAA") || N.equals("CAG"))
                gin++;
            else if (N.equals("CGU") || N.equals("CGC") || N.equals("CGA") || N.equals("CGG"))
                arg++;
        }
        System.out.println(leu + " " + pro + " " + his + " " + gin + " " + arg);
        sc.close();
    }
}
