package Library_System;

public class Library_Test {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("ISBN001", "Pride and Prejudice", "Jane Austen", "T. Egerton", true, 3));
        library.addBook(new Book("ISBN002", "1984", "George Orwell", "Secker & Warburg", false, 4));
        library.addBook(new Book("ISBN003", "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", true, 2));
        library.addBook(new Book("ISBN004", "Moby Dick", "Herman Melville", "Harper & Brothers", false, 5));
        library.addBook(new Book("ISBN005", "To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", false, 3));

        // Adding members to the library
        library.addMember(new Member("Alice", "Wonderland", "555-0101", 101));
        library.addMember(new Member("Bob", "Builder", "555-0202", 102));
        library.addMember(new Member("Charlie", "Chocolate", "555-0303", 103));
        library.addMember(new Member("Dorothy", "Oz", "555-0404", 104));
        library.addMember(new Member("Edward", "Scissorhands", "555-0505", 105));

        // View available books and library members
        System.out.println("Books in library:");
        library.viewBooks();
        
        System.out.println("Library members:");
        library.viewMembers();
        
        // Checkout books
        System.out.println("Checking out books:");
        library.checkout("ISBN001", 101);
        library.checkout("ISBN003", 103);
        library.checkout("ISBN001", 101); // This should fail due to the book already being checked out
        
        // Display current loans
        System.out.println("Current loans:");
        library.viewLoans();
        
        // Return a book
        System.out.println("Returning a book:");
        library.returnBook("ISBN001", 101);
        
        // Remove a book and a member
        System.out.println("Removing a book and a member:");
        library.removeBook("ISBN005");
        library.removeMember(105);
        
        // Display state after removals
        System.out.println("State after removals:");
        library.viewBooks();
        library.viewMembers();
        
        // Display overdue loans
        System.out.println("Overdue loans:");
        library.printOverdue();
        
        // Test search functionality
        System.out.println("Testing search functionality:");
        library.searchTitle("19"); // Search for titles containing '19'
        library.searchISBN("ISBN002"); // Search by ISBN
        library.searchAuthor("Austen"); // Search for books by Austen
        library.searchIssueDate(2024, 3, 25); // Assuming a loan was issued on this date
        library.searchDueDate(2024, 4, 8); // Assuming a loan is due on this date
        library.searchFiction(); // Display all fiction books
        library.searchNonFiction(); // Display all non-fiction books
        library.searchFName("Alice"); // Search members by first name
        library.searchLName("Wonderland"); // Search members by last name
        library.searchPhone("555-0101"); // Search members by phone
        library.searchJoined(2024, 3, 26); // Assuming a member joined on this date
    }
}
