public class Ex4 {
    public static void main(String[] args) {
        int count1 = 1;
        while (count1 <= 10) {
            /*
             * int count2 = 1;
             *
             * while (count2 <= 20) {
             * System.out.println("Hello");
             * count2++;
             * }
             */
            for (int count2 = 1; count2 <= 20; count2++)
                System.out.println("Hello");
            count1++;
        }
    }
}
