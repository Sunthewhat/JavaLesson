public class CircleCaller {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        c1.setCenter(0, 8);
        c1.printInfo();
        System.out.println(Circle.circleCounter);
        Circle c2 = new Circle();
        System.out.println(Circle.circleCounter);
        Circle c3 = new Circle();
        System.out.println(Circle.circleCounter);
    }
}