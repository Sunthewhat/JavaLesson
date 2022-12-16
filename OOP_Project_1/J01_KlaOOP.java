public class J01_KlaOOP {
    public static void main(String[] args) {
        Dog kati = new Dog("Kati", 4);
        System.out.println(Dog.dogCount);
        Dog happy = new Dog();
    }
}

class Dog {
    // Attributes
    private int age;
    private int helth;
    private double heigth;
    private String name;
    private String owner;
    public static int dogCount = 0;

    // Constructors
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.helth = 100;
        dogCount++;
    }

    public Dog() {
        this(null, 0);
    }

    // Getter_Setter Methods
    public int getAge() {
        return age;
    }

    public int getHelth() {
        return helth;
    }

    public double getHeigth() {
        return heigth;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Other Methods
    public void getHit(int damage) {
        this.helth -= damage;
    }
}