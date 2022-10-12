/**
 * J039_Dcrypt_Code
 */
public class J039_Decrypt_Code {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        String numstring = "";
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= '0' && A.charAt(i) <= '9') {
                numstring += A.charAt(i);
            } else {
                if (!numstring.isEmpty()) {
                    sum += Integer.parseInt(numstring);
                    numstring = "";
                }
                sum += A.charAt(i) - 'a' + 1;
            }
        }
        if (!numstring.isEmpty())
            sum += Integer.parseInt(numstring);

        boolean[] factor = new boolean[sum + 1];
        int tmp = sum;
        for (int i = 2; i <= sum; i++) {
            while (tmp % i == 0) {
                tmp /= i;
                factor[i] = true;
            }
        }
        int res = 0;
        for (int i = 0; i <= sum; i++) {
            if (factor[i]) {
                res += i;
            }
        }
        System.out.println(res);
        sc.close();
    }
}