import java.util.ArrayList;

public class J056_Peak_Finding {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println("1\n" + a[0]);
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {

                    if (a[i] > a[i + 1])
                        list.add(a[i]);
                } else if (i == n - 1) {

                    if (a[i] > a[i - 1])
                        list.add(a[i]);
                } else {
                    if (a[i] > a[i - 1] && a[i] > a[i + 1])
                        list.add(a[i]);
                }
            }
            System.out.println(list.size());
            for (int i : list) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}