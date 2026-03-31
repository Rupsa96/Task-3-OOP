package BookManagementSystem;

// ---------------- LIBRARY CLASS ----------------
class Library {

    // Array to store Book objects
    private Book[] books;
    private int count; // tracks number of books

    // Constructor
    public Library() {
        books = new Book[5]; // fixed size array
        count = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full!");
        }
    }

    // Method to search book by ID
    public Book searchBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                return books[i];
            }
        }
        return null; // not found
    }

    // Method to remove a book by ID
    public void removeBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {

                // Replace with last book (efficient removal)
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;

                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found!"); // when trying to remove a book that is not there
    }

    // Method to display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            Book b = books[i];
            System.out.println("ID: " + b.getBookId()
                    + ", Title: " + b.getTitle()
                    + ", Author: " + b.getAuthor()
                    + ", Available: " + b.isAvailable());
        }
    }
}
