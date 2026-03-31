package TaxCalculator;

// ---------------- EMPLOYEE CLASS ----------------
class Employee implements TaxCalculator {

    // Attributes
    private int empId;
    private String name;
    private double salary; // monthly salary

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate income tax on yearly salary
    @Override
    public double calcTax() {
        double yearlySalary = salary * 12; // convert monthly to yearly
        return yearlySalary * INCOME_TAX;
    }
}
