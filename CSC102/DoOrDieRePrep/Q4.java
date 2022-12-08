public class Q4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        for (int i = 0; i < n; i++)
            word[i] = sc.next().toLowerCase();
        for (int i = word.length - 1; i >= 0; i--) {
            if (word[i].length() > 2)
                System.out.print(word[i].substring(word[i].length() - 1) + word[i].substring(1, word[i].length() - 1)
                        + word[i].substring(0, 1) + " ");
            else
                System.out.print(word[i] + " ");
        }
        sc.close();
    }
}