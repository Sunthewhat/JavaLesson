public class Diabetes {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] gl = new int[4];
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            gl[i] = sc.nextInt();
        }
        if (gl[0] <= 95)
            cnt++;
        if (gl[1] <= 180)
            cnt++;
        if (gl[2] <= 155)
            cnt++;
        if (gl[3] <= 140)
            cnt++;

        if (cnt >= 3)
            System.out.println("Negative");
        else
            System.out.println("Potential DM");
        sc.close();
    }
}