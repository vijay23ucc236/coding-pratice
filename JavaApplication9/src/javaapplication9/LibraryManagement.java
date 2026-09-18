
package javaapplication9;


    import java.util.*;

class Book {
    int id;
    String title, author;
    boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        issued = false;
    }

    void display() {
        System.out.println(id + " | " + title + " | " + author +
                " | " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add  2.View  3.Search  4.Issue  5.Return  6.Delete  7.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                list.add(new Book(id, title, author));
                System.out.println("Book Added!");

            } else if (ch == 2) {
                for (Book b : list)
                    b.display();

            } else if (ch == 3) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();

                boolean found = false;
                for (Book b : list) {
                    if (b.id == id) {
                        b.display();
                        found = true;
                    }
                }
                if (!found) System.out.println("Book Not Found!");

            } else if (ch == 4) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();

                for (Book b : list) {
                    if (b.id == id) {
                        if (!b.issued) {
                            b.issued = true;
                            System.out.println("Book Issued!");
                        } else {
                            System.out.println("Already Issued!");
                        }
                    }
                }

            } else if (ch == 5) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();

                for (Book b : list) {
                    if (b.id == id) {
                        if (b.issued) {
                            b.issued = false;
                            System.out.println("Book Returned!");
                        } else {
                            System.out.println("Already Available!");
                        }
                    }
                }

            } else if (ch == 6) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == id) {
                        list.remove(i);
                        System.out.println("Book Deleted!");
                        break;
                    }
                }

            } else if (ch == 7) {
                break;
            }
        }
    }
}
