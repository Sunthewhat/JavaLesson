public class J032_Pattern_Triangle_4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i)
                    System.out.print("-");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
