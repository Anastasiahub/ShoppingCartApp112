public class Item {
    private String productName;
    private String model;
    private int quantity;
    private double unitPrice;
    private double total;

    public Item(String productName, String model, int quantity, double unitPrice, double total)
    {
        this.productName = productName;
        this.model = model;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public String getProductName() {
        return productName;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * quantity;
    }


}