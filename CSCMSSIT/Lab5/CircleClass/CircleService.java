package CircleClass;
public class CircleService {
    private static final double PI = 3.14159;

    public static double getArea(double radius) {
        return PI * radius * radius;
    }

    public static double getDiameter(double radius) {
        return 2 * radius;
    }

    public static double getPerimeter(double radius) {
        return 2 * PI * radius;
    }
}
