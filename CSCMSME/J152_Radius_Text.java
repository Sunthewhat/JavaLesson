public class J152_Radius_Text {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if (len % 2 == 0)
            System.out.println("ERROR");
        else {
            int biglen = (len * 2) - 1;
            str += " ";
            String[][] A = new String[len + 10][len + 10];
            for (int n = 0; n < len; n++) {
                for (int i = 0; i < biglen; i++) {
                    for (int j = 0; j < biglen; j++) {
                        if (i == n) {
                        A[i][j] = str.substring(n, n + 1);
                        } else
                        A[i][j] = "*";
                    }
                }
            }
            for (int i = 0; i < biglen; i++) {
                for (int j = 0; j < biglen; j++) {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
