public class J145_Overlapped_Circles {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        if (distance == 0) {
            if (r1 == r2)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if (distance > Math.max(r1, r2)) {
            if (r1 + r2 >= distance)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else {
            if (distance + Math.min(r1, r2) >= Math.max(r1, r2))
                System.out.println("Yes");
            else
                System.out.println("No");

        }

        sc.close();
    }
}
