/*Static Members and Complex Object Interaction

**Question:** Create a `Library` class with:

- Static variable `totalBooks` to track all books across all libraries
- Static method `getTotalBooks()` to return the total
- Instance variables: `libraryName`, `books` (array of Strings), `bookCount`
- Methods: `addBook(String bookTitle)`, `removeBook(String bookTitle)`, `displayBooks()`
- Use `this` keyword appropriately throughout */

public class Library {
    private static int totalBooks = 0;
    
    private String libraryName;
    private String[] books;
    private int bookCount;
    
    public Library(String libraryName, int maxCapacity) {
        this.libraryName = libraryName;
        this.books = new String[maxCapacity];
        this.bookCount = 0;
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }
    
    public void addBook(String bookTitle) {
        if (this.bookCount < this.books.length) {
            this.books[this.bookCount] = bookTitle;
            this.bookCount++;
            totalBooks++;
            System.out.println("Added '" + bookTitle + "' to " + this.libraryName);
        } else {
            System.out.println("Library " + this.libraryName + " is at full capacity");
        }
    }
    
    public boolean removeBook(String bookTitle) {
        for (int i = 0; i < this.bookCount; i++) {
            if (this.books[i].equals(bookTitle)) {
                // Shift books to fill the gap
                for (int j = i; j < this.bookCount - 1; j++) {
                    this.books[j] = this.books[j + 1];
                }
                this.bookCount--;
                totalBooks--;
                System.out.println("Removed '" + bookTitle + "' from " + this.libraryName);
                return true;
            }
        }
        System.out.println("Book '" + bookTitle + "' not found in " + this.libraryName);
        return false;
    }
    
    public void displayBooks() {
        System.out.println("\n" + this.libraryName + " Books:");
        for (int i = 0; i < this.bookCount; i++) {
            System.out.println((i + 1) + ". " + this.books[i]);
        }
        System.out.println("Books in this library: " + this.bookCount);
    }
    
    public String getLibraryName() {
        return this.libraryName;
    }
    
    public int getBookCount() {
        return this.bookCount;
    }

    public static void main(String[] args) {
        // Create four libraries with different capacities
        Library library1 = new Library("Central Library", 10);
        Library library2 = new Library("University Library", 15);
        Library library3 = new Library("Town Library", 8);
        Library library4 = new Library("Children's Library", 5);

        // Add books to each library
        library1.addBook("The Lord of the Rings");
        library1.addBook("Pride and Prejudice");
        library1.addBook("1984");
        library1.addBook("To Kill a Mockingbird");
        library1.addBook("The Hobbit");

        library2.addBook("The Hitchhiker's Guide to the Galaxy");
        library2.addBook("Dune");
        library2.addBook("Foundation");
        library2.addBook("Neuromancer");
        library2.addBook("Snow Crash");
        library2.addBook("The Martian");
        library2.addBook("Project Hail Mary");

        library3.addBook("The Great Gatsby");
        library3.addBook("Moby Dick");
        library3.addBook("War and Peace");
        library3.addBook("Crime and Punishment");
        library3.addBook("Anna Karenina");

        library4.addBook("Charlie and the Chocolate Factory");
        library4.addBook("Matilda");
        library4.addBook("The BFG");
        library4.addBook("Paddington");


        // Display books in each library
        System.out.println("Total Books Added: " + Library.getTotalBooks());
        library1.displayBooks();
        library2.displayBooks();
        library3.displayBooks();
        library4.displayBooks();


        // Remove a book from each library
        library1.removeBook("1984");
        library2.removeBook("Dune");
        library3.removeBook("War and Peace");
        library4.removeBook("Paddington");

        // Display books after removal
        System.out.println("\nTotal Books Remaining: " + Library.getTotalBooks());
        library1.displayBooks();
        library2.displayBooks();
        library3.displayBooks();
        library4.displayBooks();
    }

}