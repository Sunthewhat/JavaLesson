public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println(Circle2.color);
        Circle2 c2 = new Circle2();
        c2.setRadius(3);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
    }
}
