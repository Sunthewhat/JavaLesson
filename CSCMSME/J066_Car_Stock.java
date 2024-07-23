class StockOwner {
    private String name;
    private long money;
    private java.util.Vector<Stock> stocks;

    public StockOwner(String name, long money) {
        this.name = name;
        this.money = money;
        this.stocks = new java.util.Vector<Stock>();
    }

    public String getName() {
        return this.name;
    }

    public long getMoney() {
        return this.money;
    }

    public void AddStock(Stock s) {
        this.stocks.add(s);
    }

    public void buyCar(Stock s, Car c) {
        if (this.money < c.getPrice())
            return;
        this.money -= c.getPrice();
        s.buy(c);
    }

    public void buyAllCar(Stock s1, Stock s2) {
        for (Car c : s2.getAllCar()) {
            if (this.money < c.getPrice())
                return;
            this.money -= c.getPrice();
            s1.buy(c);
        }
        s2.clearAllCar();
    }

    public long calculateAllAsset() {
        long sum = 0;
        for (Stock s : this.stocks) {
            for (Car c : s.getAllCar()) {
                sum += c.getPrice();
            }
        }
        return sum;
    }

    public int getAmountofCar() {
        int sum = 0;
        for (Stock s : this.stocks) {
            sum += s.getAllCar().size();
        }
        return sum;
    }
}

class Stock {
    private java.util.Vector<Car> cars;

    public Stock() {
        this.cars = new java.util.Vector<Car>();
    }

    public void buy(Car c) {
        this.cars.add(c);
    }

    public java.util.Vector<Car> getAllCar() {
        return this.cars;
    }

    public void printAllCar() {
        for (Car c : this.cars) {
            System.out.println("Car Name : " + c.getName());
            System.out.println("Car Brand : " + c.getBrand());
            System.out.println("Car Price : " + c.getPrice());
        }
    }

    public void clearAllCar() {
        this.cars.clear();
    }
}

class Car {
    private String name;
    private String brand;
    private long price;

    public Car(String name, String brand, long price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Car(String name, String brand) {
        this(name, brand, 1000000);
    }

    public Car(String name) {
        this(name, "BMW", 1000000);
    }

    public Car() {
        this("Car1", "BMW", 1000000);
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public long getPrice() {
        return this.price;
    }
}

class J066_Car_Stock {

    public static void main(String[] args) {
        StockOwner Owner1 = new StockOwner("RichMan", 1000000000);
        Stock s1 = new Stock();
        Stock s2 = new Stock();
        Stock s3 = new Stock();
        Stock s4 = new Stock();
        Owner1.AddStock(s1);
        Owner1.AddStock(s3);
        Owner1.AddStock(s4);
        Car c1 = new Car();
        Car c2 = new Car("Rod");
        Car c3 = new Car("Spike", "Benz", 20000000);
        Car c4 = new Car("Lambo", "Lambo");
        Car c5 = new Car("Noname");
        Car c6 = new Car("Unnamed", "Unnamed", 300000000);
        s2.buy(c1);
        s2.buy(c2);
        System.out.println("Money of Owner");
        System.out.println("Name : " + Owner1.getName());
        System.out.println("Money : " + Owner1.getMoney());
        System.out.println("___________________________");
        Owner1.buyCar(s1, c3);
        Owner1.buyCar(s3, c4);
        Owner1.buyCar(s3, c5);
        Owner1.buyCar(s4, c6);
        System.out.println("Money of Owner <After Buy>");
        System.out.println("Name : " + Owner1.getName());
        System.out.println("Money : " + Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
        Owner1.buyAllCar(s4, s2);
        System.out.println("Money of Owner <After Buy 2nd time>");
        System.out.println("Name : " + Owner1.getName());
        System.out.println("Money : " + Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("All asset");
        System.out.println("Value of Asset : " + Owner1.calculateAllAsset());
        System.out.println("Cars : " + Owner1.getAmountofCar());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
    }
}
