class Factory {
    // iron copper silver gold
    double iron, copper, silver, gold;
    int CircuitBoard = 0;

    public Factory(double iron, double copper, double silver, double gold) {
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
    }

    public double getIron() {
        return iron;
    }

    public double getCopper() {
        return copper;
    }

    public double getSilver() {
        return silver;
    }

    public double getGold() {
        return gold;
    }

    public int getCircuitBoard() {
        return CircuitBoard;
    }

    public void buildCircuitBoard(int Demand) {
        this.silver -= 2 * Demand / 1000000;
        this.gold -= 0.01 * Demand / 1000000;
        this.copper -= 5 * Demand / 1000000;
    }
}

// 1ton = 1milgrams
public class J131_Factory_OOP {
    public static void main(String[] args) {
        Factory fac1 = new Factory(67, 9, 10, 1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}
