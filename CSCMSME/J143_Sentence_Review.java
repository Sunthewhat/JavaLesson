public class J143_Sentence_Review {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.Set<Character> map = new java.util.HashSet<>();
        String str = sc.nextLine();
        int sumAscii = 0;
        for (char x : str.toCharArray()) {
            if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9')) {
                if (!map.contains(x)) {
                    sumAscii += (int) x;
                    map.add(x);
                }
            }
        }
        long square = (long) sumAscii * sumAscii;
        int len = str.length();
        long opt = square % (long) len;
        if (opt < 0 || opt > 10) {
            System.out.println("Error");
        } else
            System.out.println(opt + "/10");
        sc.close();
    }
}
