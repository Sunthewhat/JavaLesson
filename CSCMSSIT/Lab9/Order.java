public class Order {
    private int orderId;
    private LineItem lineItems[];
    private double totalAmount;
    private static int count;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderId = count++;
        this.totalAmount = 0;
        this.lineItems = new LineItem[20];
    }

    public void addLineItem(LineItem lineItem, int index) {
        if (lineItems[index] == null) {
            lineItems[index] = lineItem;
            System.out.println("Add line item successfully.");
        } else
            System.out.println("The array is not empty. Line item cannot be added.");
    }

    public void addLineItem(LineItem lineItem) {
        boolean addSuccess = false;
        for (int i = 0; i < lineItems.length; i++) {
            if (lineItems[i] == null) {
                lineItems[i] = lineItem;
                addSuccess = true;
                break;
            }
        }
        if (addSuccess)
            System.out.println("Add line item successfully.");
        else
            System.out.println("Your basket is full. Cannot add a line item.");
    }

    public void removeLineItemByArrayIndex(int index) {
        if (lineItems[index] != null) {
            lineItems[index] = null;
            System.out.println("Remove line item successfully.");
        } else
            System.out.println("The array is empty. Nothing removed.");
    }

    public void calculateTotalAmount() {
        double sum = 0;
        for (LineItem l : lineItems) {
            if (l != null) {
                sum += l.calculateTotalAmount();
            }
        }
        totalAmount = sum;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        calculateTotalAmount();
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printLineItem() {
        for (LineItem l : lineItems) {
            if (l != null) {
                l.printDetail();
            }
        }
    }
}
