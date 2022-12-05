import java.util.Scanner;

public class J070_Vending_Machine {
    public static void main(String args[]) {
        VendingMachine vm = new VendingMachine();
        Product p1 = new Product("Pepsi", 13, 110);
        Product p2 = new Product("Coke", 13, 120);
        Product p3 = new Product("Fanta", 12, 130);
        Product p4 = new Product("Splash", 10, 140);
        Product p5 = new Product("Kit-kat", 15, 210);
        Product p6 = new Product("Snickers", 15, 220);
        Product p7 = new Product("Ferrero", 35, 230);
        Product p8 = new Product("vanhouten", 30, 240);
        Product p9 = new Product("Lay's", 25, 310);
        Product p10 = new Product("Testo", 20, 320);

        p1.setQuantity(20);
        p2.setQuantity(20);
        p3.setQuantity(20);
        p4.setQuantity(20);
        p5.setQuantity(20);
        p6.setQuantity(20);
        p7.setQuantity(20);
        p8.setQuantity(20);
        p9.setQuantity(20);
        p10.setQuantity(20);

        vm.addProduct(p1, 0);
        vm.addProduct(p2, 1);
        vm.addProduct(p3, 2);
        vm.addProduct(p4, 3);
        vm.addProduct(p5, 4);
        vm.addProduct(p6, 5);
        vm.addProduct(p7, 6);
        vm.addProduct(p8, 7);
        vm.addProduct(p9, 8);
        vm.addProduct(p10, 9);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            vm.insertCoin(sc.nextInt());
        }
        System.out.println("---Inserted Money---");
        System.out.println(vm.getInsertedMoney());
        int pindex = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("---Buy " + q + " of " + vm.getProduct(pindex).getName() + " costs " + (vm.getProduct(pindex).getPrice() * q) + " baht---");
        System.out.println("---Change---");
        vm.buy(pindex, q);
    }
}

class Product {
    private int price;
    private String name;
    private int id;
    private int quantity;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.quantity = 0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
}

class VendingMachine {
    private Product[] slots = new Product[10];
    private int[] coins = { 0, 0, 0 };
    private int[] coinsref = { 0, 0, 0 };
    private int insertedMoney = 0;
    private CoinProcessor cp = new CoinProcessor(100, 100, 100);

    public VendingMachine() {

    }

    public void buy(int index, int quantity) {
        if (!cp.returnChange(insertedMoney - slots[index].getPrice() * quantity, coins)) {
            System.out.println("Not enough change");
        }
    }

    public void insertCoin(int coin) {
        switch (coin) {
            case 1:
                coins[0]++;
                break;
            case 5:
                coins[1]++;
                break;
            case 10:
                coins[2]++;
                break;
        }
        insertedMoney += coin;
    }

    public void addProduct(Product product, int index) {
        slots[index] = product;
    }

    public void removeProduct(int index) {
        slots[index] = null;
    }

    public void addQuantity(int index, int quantity) {
        slots[index].addQuantity(quantity);
    }

    public Product getProduct(int index) {
        return slots[index];
    }

    public int getInsertedMoney() {
        return insertedMoney;
    }

    public void cancle() {
        insertedMoney = 0;
        coins = coinsref;
    }

}

class CoinProcessor {
    private int onebahtCoin, fivebahtCoin, tenbahtCoin;

    CoinProcessor() {
        this.onebahtCoin = 0;
        this.fivebahtCoin = 0;
        this.tenbahtCoin = 0;
    }

    CoinProcessor(int one, int five, int ten) {
        this.onebahtCoin = one;
        this.fivebahtCoin = five;
        this.tenbahtCoin = ten;
    }
    

    public boolean returnChange(int money, int[] coins) {
        int coinMoney = coins[0] + coins[1] * 5 + coins[2] * 10;
        return coinMoney >= money ? true : false;
    }

}
