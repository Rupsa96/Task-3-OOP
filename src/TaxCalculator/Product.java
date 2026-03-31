package TaxCalculator;

// ---------------- PRODUCT CLASS ----------------
class Product implements TaxCalculator {

    // Attributes
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate sales tax on unit price
    @Override
    public double calcTax() {
        return price * SALES_TAX; // tax per unit
    }
}
