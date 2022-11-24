import java.util.Scanner;

public class Cuboid_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            Cuboid c = new Cuboid();
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        } else {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            Cuboid c = new Cuboid(x, y, z);
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        }
        sc.close();
    }
}

class Cuboid {
    // Attributes
    private double width;
    private double height;
    private double length;

    // Constructors
    public Cuboid() {
        this.width = 1;
        this.height = 1;
        this.length = 1;
    }

    public Cuboid(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Methods
    public double getVolumn() {
        return width * height * length;
    }

    public double getSurface() {
        return (2 * (width * height)) + (2 * (width * length)) + (2 * (height * length));
    }
}