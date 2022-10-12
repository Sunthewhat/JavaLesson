package CircleClass;
/**
 * Circle
 */
public class Circle {
    final double pi = 3.14159;
    private double Radius;
    static int countCircleObject = 0;
    private int X, Y;

    public void setRadius(double Radius) {
        countCircleObject++;
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea() {
        return pi * Radius * Radius;
    }

    public double getAreaOfCircles(int n) {
        return pi * getArea();
    }

    public double getPerimeter() {
        return 2 * pi * Radius;
    }

    public double getDiameter() {
        return 2 * Radius;
    }

    public void setCenter(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void printInfo() {
        System.out.println("The circle have:");
        System.out.println("radius = " + Radius);
        System.out.println("area = " + getArea());
        System.out.println("diameter = " + getDiameter());
        System.out.println("coordinate  = (" + X + "," + Y + ")");
    }

    public static int getNumberOfCircleObjects() {
        return countCircleObject;
    }
}