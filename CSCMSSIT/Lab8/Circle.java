public class Circle extends GeometricObject {
    private double radius;
    private double PI = Math.PI;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this(radius, "white", true);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }
}