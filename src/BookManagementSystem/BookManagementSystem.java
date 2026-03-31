package BookManagementSystem;
/*
QUESTION:

Design a Java program that uses OOP principles to model a Book Management System.

1. Create two classes: Book and Library.
   - Book class should have attributes: bookId, title, author, isAvailable.
   - Include constructor, getters and setters.

2. Library class should:
   - Store Book objects using an array.
   - Provide methods to:
        • Add a book
        • Remove a book using bookId
        • Search a book using bookId
        • Display all books

3. Create a main class to:
   - Provide a menu-driven program
   - Allow user interaction with the system
*/

import java.util.Scanner;

// ---------------- MAIN CLASS ----------------
public class BookManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Menu-driven program
        while (true) {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add book
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author, true));
                    break;

                case 2:
                    // Remove book
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    // Search book
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();

                    Book found = library.searchBook(searchId);
                    if (found != null) {
                        System.out.println("Book Found:");
                        System.out.println("Title: " + found.getTitle());
                        System.out.println("Author: " + found.getAuthor());
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    // Display all books
                    library.displayBooks();
                    break;

                case 5:
                    // Exit program
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
