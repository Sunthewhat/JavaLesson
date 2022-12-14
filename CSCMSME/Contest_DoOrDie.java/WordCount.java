public class WordCount {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.substring(i, i + b.length()).equals(b)) {
                count++;
                i += b.length() - 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
