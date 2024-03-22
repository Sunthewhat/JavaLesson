public class Mechanical_Pen {
    // Attributes
    private stringLearn penColor;
    private int length;
    private stringLearn inkColor;
    private boolean isOpen;

    // Constructor
    public Mechanical_Pen(stringLearn penColor, int length, stringLearn inkColor) {
        this.penColor = penColor;
        this.length = length;
        this.inkColor = inkColor;
        this.isOpen = false;
    }

    // Method
    public void click() {
        this.isOpen = !isOpen;
    }

    public void changeInkColor(stringLearn inkColor) {
        this.inkColor = inkColor;
    }

    public stringLearn getPenColor() {
        return penColor;
    }

    public void setPenColor(stringLearn newPenColor) {
        this.penColor = newPenColor;
    }

    public int getLength() {
        return length;
    }
}