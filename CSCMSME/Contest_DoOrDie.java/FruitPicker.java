import java.util.Arrays;

public class FruitPicker {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        n *= m;
        int sum = 0;
        int[] basket = new int[n];
        for (int i = 0; i < n; i++)
            basket[i] = sc.nextInt();
        Arrays.sort(basket);
        int[] re_basket = new int[n];
        int len = basket.length;
        for (int i = 0; i < basket.length; i++) {
            re_basket[i] = basket[--len];
        }

        for (int i = 0; i < d && i < re_basket.length; i++) {
            if (re_basket[i] - i < 0)
                break;
            sum += re_basket[i] - i;
        }
        System.out.println(sum);
        sc.close();
    }
}