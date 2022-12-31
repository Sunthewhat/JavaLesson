import java.util.Arrays;

public class arrays_3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean[] ch = new boolean[11000];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (ch[arr[i]] == false) {
                System.out.print(arr[i] + " ");
                ch[arr[i]] = true;
            }
        }
        sc.close();
    }
}