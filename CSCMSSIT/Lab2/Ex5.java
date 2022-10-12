public class Ex5 {
    public static void main(String[] args) {
        int x = 1;
        boolean result1 = (x == 1) || (x++ < 10);
        System.out.println(result1);
        System.out.println(x);

        x = 1;
        boolean result2 = (x == 1) | (x++ < 10);
        System.out.println(result2);
        System.out.println(x);
    }
}
