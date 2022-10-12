public class J112_DNA_Sequences {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String NewB = "";
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == 'A')
                NewB += "T";
            else if (B.charAt(i) == 'T')
                NewB += "A";
            else if (B.charAt(i) == 'G')
                NewB += "C";
            else
                NewB += "G";
        }
        int cnt = 0;
        int aindex = 0;
        for (int i = 0; i < B.length(); i++) {
            if (i > A.length())
                break;
            for (int j = aindex; j < A.length(); j++) {
                if (A.charAt(j) == NewB.charAt(i)) {
                    cnt++;
                    aindex++;
                    break;
                }
                aindex++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
