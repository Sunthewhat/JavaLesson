public class Member extends Customer {
    private double points;

    public Member(String firstname, String lastname, int customerId) {
        super(firstname, lastname, customerId);
        points = 0;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points += points;
    }

    public double convertPoints(double points) {
        double converted = points * 20;
        this.points -= points;
        return converted;
    }
}
