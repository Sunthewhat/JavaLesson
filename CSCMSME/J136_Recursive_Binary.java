/**
 * J136_Recursive_Binary
 */
public class J136_Recursive_Binary {

    static long find(int decimal_number) {
        if (decimal_number == 0)
            return 0;

        else

            return (decimal_number % 2 + 10 *
                    find(decimal_number / 2));
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(find(num));
        sc.close();
    }
}