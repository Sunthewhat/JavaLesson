/**
 * GeomatricObject
 */
public class GeometricObject {

    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "blue";
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    
    public void printInfo() {
        if (filled) {
            System.out.println("The Geometric is " + color + " and it is " + "filled.");
        } else {
            System.out.println("The Geometric is " + color + " but it is not " + "filled.");
        }
    }
}