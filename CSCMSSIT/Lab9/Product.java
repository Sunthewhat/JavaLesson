public class Product {
    private String productName;
    private int productId;
    private double price;

    public Product(String productname, int productId, double price) {
        this.productName = productname;
        this.productId = productId;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
