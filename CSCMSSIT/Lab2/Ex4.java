public class Ex4 {
    public static void main(String[] args) {
        int x = 10;
        /*
         * if (x == 10) {
         * System.out.println("x is equal to 10");
         * } else {
         * System.out.println("x is " + x);
         * }
         */
        // System.out.println(x == 10 ? "x is equal to 10" : "x is " + x);
        if (x == 10)
            System.out.println("x is equal to 10");
        else if (x < 10)
            System.out.println("x is less than 10");
        else if (x > 10 && x < 50)
            System.out.println("x is greater than 10");
        else
            System.out.println("x is " + x);
    }
}