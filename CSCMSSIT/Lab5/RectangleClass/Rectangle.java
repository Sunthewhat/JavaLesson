/**
 * Rectangle
 */
public class Rectangle {
    private double w, h;

    public void setWidthHeight(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getPerimeter() {
        return (2 * w) + (2 * h);
    }

    public double getArea() {
        return w * h;
    }

    public void printInfo() {
        System.out.println(w);
        System.out.println(h);
        System.out.println(getPerimeter());
        System.out.println(getArea());
    }
}