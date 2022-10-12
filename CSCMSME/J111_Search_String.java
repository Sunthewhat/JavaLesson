public class J111_Search_String {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int lena = a.length(), lenb = b.length();
        boolean front = false, back = false;
        if (a.substring(0, lenb).equals(b))
            front = true;
        if (a.substring(lena - lenb).equals(b))
            back = true;
        if (front && back)
            System.out.println("Front,Back");
        else if (front)
            System.out.println("Front");
        else if (back)
            System.out.println("Back");
        else
            System.out.println("No");
        sc.close();
    }
}
