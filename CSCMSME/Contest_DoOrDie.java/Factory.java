class Factory {
    // Attribute
    private double iron;
    private double copper;
    private double silver;
    private double gold;
    private int circuitBoard;

    // Constructor
    public Factory(double iron, double copper, double silver, double gold) {
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
        circuitBoard = 0;
    }

    // Method
    // Getter
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
        return circuitBoard;
    }

    // Setter
    public void setIron(double iron) {
        this.iron = iron;
    }

    public void setCopper(double copper) {
        this.copper = copper;
    }

    public void setSilver(double silver) {
        this.silver = silver;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public void setCircuitBoard(int circuitBoard) {
        this.circuitBoard = circuitBoard;
    }

    // Other Method
    public void buildCircuitBoard(int n) {
        copper -= (n * 5.0) / 1000000;
        silver -= (n * 2.0) / 1000000;
        gold -= (n * 0.01) / 1000000;
        circuitBoard += n;
    }
}

class Main {
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
