public class RectangleCaller {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        r1.setWidthHeight(5, 10);
        r2.setWidthHeight(2.5, 1.5);
        r3.setWidthHeight(25, 5);
        System.out.println();
        r1.printInfo();
        System.out.println();
        r2.printInfo();
        System.out.println();
        r3.printInfo();
    }
}