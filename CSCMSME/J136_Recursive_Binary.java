public class J136_Recursive_Binary {
    static int find(int decimal_number) {
        if (decimal_number == 0)
            return 0;

        else

            return (decimal_number % 2 + 10 *
                    find(decimal_number / 2));
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(find(a));
        sc.close();
    }
}
