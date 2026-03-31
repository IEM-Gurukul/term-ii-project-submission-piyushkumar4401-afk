package service;

import model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Issue Book\n4. Return Book\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addBook(sc);
                case 2 -> viewBooks();
                case 3 -> issueBook(sc);
                case 4 -> returnBook(sc);
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addBook(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book Added Successfully!");
    }

    private void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getTitle() + " | Issued: " + b.isIssued());
        }
    }

    private void issueBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book Issued!");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    private void returnBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == id && b.isIssued()) {
                b.returnBook();
                System.out.println("Book Returned!");
                return;
            }
        }
        System.out.println("Invalid Book ID.");
    }
}
