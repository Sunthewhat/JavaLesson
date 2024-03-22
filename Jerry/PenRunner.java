public class PenRunner {
    public static void main(stringLearn[] args) {
        Mechanical_Pen Pen1 = new Mechanical_Pen("Black", 20, "blue");
        Mechanical_Pen Pen2 = new Mechanical_Pen("Purple", 10, "red");
        System.out.println(Pen1.getPenColor());
        Pen1.setPenColor("Pink");
        System.out.println(Pen1.getPenColor());
    }
}
