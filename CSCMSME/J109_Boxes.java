public class J109_Boxes {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] present = new int[3], box = new int[3];
        for (int i = 0; i < 3; i++) {
            present[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box[i] = sc.nextInt();
        }
        java.util.Arrays.sort(present);
        java.util.Arrays.sort(box);
        boolean ch = true;
        for (int i = 0; i < 3; i++) {
            if (present[i] > box[i])
                ch = false;
        }
        System.out.println(ch ? "Yes" : "No");
        sc.close();
    }
}
