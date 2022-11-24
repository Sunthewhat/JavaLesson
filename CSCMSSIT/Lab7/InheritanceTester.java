public class InheritanceTester {
    public static void main(String[] args) {
        InheritanceTester tester = new InheritanceTester();
        GeometricObject g1 = new GeometricObject();
        tester.printGeometricObjectInfo(g1);
        Circle c1 = new Circle();
        tester.printGeometricObjectInfo(c1);
        Rectangle r1 = new Rectangle();
        tester.printGeometricObjectInfo(r1);
    }

    public void printGeometricObjectInfo(GeometricObject g) {
        g.printInfo();
    }
}