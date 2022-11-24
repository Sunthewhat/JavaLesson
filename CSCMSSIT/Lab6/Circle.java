/**
 * Circle
 */
public class Circle {

    private double radius, xcoor, ycoor;
    private final double pi = Math.PI;
    public static int circleCounter;

    public Circle() {
        circleCounter++;
    }

    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }

    public Circle(double r, double x, double y) {
        radius = r;
        xcoor = x;
        ycoor = y;
        circleCounter++;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void setCenter(double x, double y) {
        this.xcoor = x;
        this.ycoor = y;
    }

    public String getCenter() {
        return xcoor + "," + ycoor;
    }

    public double getAreaOfCircles(int n) {
        return n * getArea();
    }

    // print the information of a circle (radius, center coordinates,
    // area,perimeter, and diameter)
    public void printInfo() {
        System.out.println("The circle have:");
        System.out.println("radius = " + radius);
        System.out.println("area = " + getArea());
        System.out.println("area = " + getPerimeter());
        System.out.println("diameter = " + getDiameter());
        System.out.println("coordinate  = (" + xcoor + "," + ycoor + ")");
    }
}