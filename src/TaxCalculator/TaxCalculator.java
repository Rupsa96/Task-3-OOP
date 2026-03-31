package TaxCalculator;

// ---------------- INTERFACE ----------------
interface TaxCalculator {

    // Constants (by default public, static, final)
    double SALES_TAX = 0.07;
    double INCOME_TAX = 0.105;

    // Abstract method (must be implemented by classes)
    double calcTax();
}
