public class Quiz_1_4_ASCII {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < q; i++) {// for q
            String tmp = sc.next();
            sum = 0;
            for (int j = 0; j < tmp.length(); j++) { // for j
                sum += tmp.charAt(j);
                sum %= 90;
            }
            System.out.print((char) sum);
        }
        System.out.println();
        sc.close();
    }
}