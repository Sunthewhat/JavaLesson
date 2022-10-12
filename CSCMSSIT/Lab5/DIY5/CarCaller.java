class Car {

    private int Id;
    private double Distance;
    private String Brand, Color, Owner;
    public static double accumulatedDist;

    public Car(int Id) {
        this.Id = Id;
    }

    public Car(int Id, String Brand, String Color, String Owner) {
        this.Id = Id;
        this.Brand = Brand;
        this.Color = Color;
        this.Owner = Owner;
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

    public void drive(int Distance) {
        this.Distance += Distance;
        accumulatedDist += Distance;
    }

    public int getId() {
        return Id;
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

    public double getTotalDrivingDist() {
        return Distance;
    }
}

public class CarCaller {
    public static void main(String[] args) {
        Car car1 = new Car(15012016);
        Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
        Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yello", "Smith");

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
