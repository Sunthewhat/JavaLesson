public class J055_AB_Problem {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        String sum = "";
        int lena = A.length(), lenb = B.length();
        if (lenb > lena) {
            String tmp = A;
            A = B;
            B = tmp;
        }
        int len = Math.max(lena, lenb);
        lenb = Math.min(lena, lenb) - 1;
        int tod = 0;
        int i;
        for (i = len - 1; i >= 0; i--) {
            if (lenb < 0)
                break;
            int dig = (A.charAt(i) - '0') + (B.charAt(lenb) - '0');
            lenb--;
            sum = String.valueOf((dig % 10) + tod) + sum;
            tod = 0;
            if (dig >= 10)
                tod++;
        }
        for (int j = i; j >= 0; j--) {
            int dig = A.charAt(i) - '0';
            sum = String.valueOf((dig % 10) + tod) + sum;
            tod = 0;
            if (dig >= 10)
                tod++;
        }
        if (tod == 1)
            sum = "1" + sum;
        System.out.println(sum);
        sc.close();
    }
}
