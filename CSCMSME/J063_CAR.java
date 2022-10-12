//Import here
class Car {
    private int ID;
    private String Brand;
    private String Color;
    private String Owner;
    private double Distance = 0;
    public static double accumulatedDist = 0;

    public Car(int ID) {
        this.ID = ID;
    }

    public Car(int ID, String Brand, String Color, String Owner) {
        this.ID = ID;
        this.Brand = Brand;
        this.Color = Color;
        this.Owner = Owner;
    }

    public int getId() {
        return ID;
    }

    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return Color;
    }

    public String getOwner() {
        return Owner;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void drive(int distance) {
        this.Distance += distance;
        accumulatedDist += distance;
    }

    public double getTotalDrivingDist() {
        return Distance;
    }
}

public class J063_CAR {
    public static void main(String[] args) {
        Car car1 = new Car(15012016);
        Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
        Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yellow", "Smith");

        car1.setBrand("Lamborghini Veneno");
        car1.setColor("Black");
        car1.setOwner("James");

        car1.drive(120);
        car2.drive(300);
        car2.drive(50);
        car1.drive(15);

        System.out.println("----- car1 Info -----");
        System.out.println("id: " + car1.getId() +
                " brand: " + car1.getBrand() +
                " color: " + car1.getColor() +
                " owner: " + car1.getOwner() +
                " total driving distance: " + car1.getTotalDrivingDist());

        System.out.println("----- car2 Info -----");
        System.out.println("id: " + car2.getId() +
                " brand: " + car2.getBrand() +
                " color: " + car2.getColor() +
                " owner: " + car2.getOwner() +
                " total driving distance: " + car2.getTotalDrivingDist());

        System.out.println("----- car3 Info -----");
        System.out.println("id: " + car3.getId() +
                " brand: " + car3.getBrand() +
                " color: " + car3.getColor() +
                " owner: " + car3.getOwner() +
                " total driving distance: " + car3.getTotalDrivingDist());

        System.out.println("---Accumulated Driving Distance---");
        System.out.println(Car.accumulatedDist);
    }
}
