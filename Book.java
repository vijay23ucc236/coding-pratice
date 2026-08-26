import java.util.Scanner;

class Book
 {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Book(int bookId, String title, String author)
	{
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Display book details
    void display()
	{
        System.out.println("Book ID     : " + bookId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Availability: " +
                (isAvailable ? "Available" : "Borrowed"));
        System.out.println("-------------------------");
    }

    // Borrow book
    void borrowBook() 
	{
        if (isAvailable)
		{
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else
		{
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    void returnBook()
	{
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}

class Library
 {
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        // Array of objects
        Book[] books = new Book[100];
        int count = 0;

        while (true) 
		{
            System.out.println("\n===== MINI LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, title, author);
                    count++;

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (count == 0)
					{
                        System.out.println("No books available.");
                    }
					else
					{
                        for (int i = 0; i < count; i++)
						{
                            books[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    boolean foundBorrow = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].bookId == borrowId) {
                            books[i].borrowBook();
                            foundBorrow = true;
                            break;
                        }
                    }

                    if (!foundBorrow) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    boolean foundReturn = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (books[i].bookId == returnId) 
						{
                            books[i].returnBook();
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn) 
					{
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
	}
 }