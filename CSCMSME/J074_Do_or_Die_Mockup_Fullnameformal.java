public class J074_Do_or_Die_Mockup_Fullnameformal {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.next().toLowerCase();
        String sur = sc.next().toLowerCase();
        // 32;
        System.out.println(
                (char) (name.charAt(0) - 32) + name.substring(1) + " " + (char) (sur.charAt(0) - 32)
                        + sur.substring(1));
        sc.close();
    }
}
