package TaxCalculator;
/*
QUESTION:

Create an interface with members:
- salesTax = 7%
- incomeTax = 10.5%
- An abstract method calcTax()

a) Create a class Employee (empId, name, salary) that implements the interface
   and calculates income tax on yearly salary.

b) Create a class Product (pid, price, quantity) that implements the interface
   and calculates sales tax on unit price.

c) Create a main class (DriverMain) that:
   - Accepts employee and product details from user
   - Displays income tax and sales tax
*/

// ---------------- MAIN CLASS ----------------
import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Employee Input --------
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        // Create Employee object
        Employee emp = new Employee(empId, name, salary);

        // Display Income Tax
        System.out.println("Income Tax: " + emp.calcTax());

        // -------- Product Input --------
        System.out.print("\nEnter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Create Product object
        Product product = new Product(pid, price, quantity);

        // Display Sales Tax
        System.out.println("Sales Tax (per unit): " + product.calcTax());
    }
}
