public class J028_Calculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long a = sc.nextLong();
        char op = sc.next().charAt(0);
        long b = sc.nextLong();
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0)
                    System.out.println("error");
                else
                    System.out.println(a / b);
                break;
            case '%':
                if (b == 0)
                    System.out.println("error");
                else
                    System.out.println(a % b);
                break;
            default:
                System.out.println("error");
                break;
        }
        sc.close();
    }
}