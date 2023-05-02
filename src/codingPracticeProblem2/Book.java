package codingPracticeProblem2;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void addBook(Book book) {
        bookCollection.add(book);
    }

    public void removeBook(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("C Programming", "Dennis Ritchie");
        Book secondBook = new Book("Effective Java", "Joshua Bloch");
        firstBook.addBook(firstBook);
        secondBook.addBook(secondBook);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        System.out.println("List of books:");
        for (Book bookList : bookCollection) {
            System.out.println(bookList.getTitle() + " by " + bookList.getAuthor());
        }
        firstBook.removeBook(firstBook);
        System.out.println("\nAfter removing " + firstBook.getTitle() + ":");
        System.out.println("List of books:");
        for (Book bookList : bookCollection) {
            System.out.println(bookList.getTitle() + " by " + bookList.getAuthor());
        }
    }
}
