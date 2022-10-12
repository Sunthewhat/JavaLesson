public class J123_Matching {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if (A.equals(B))
            System.out.print("Perfect Match");
        else if (A.equalsIgnoreCase(B) || A.toLowerCase().contains(B.toLowerCase())
                || B.toLowerCase().contains(A.toLowerCase()))
            System.out.print("Partial Match");
        else
            System.out.print("Not Match");
        System.out.println();
        sc.close();
    }
}