import java.util.Arrays;

public class Library {
    // will contain an array of books as an instance variable
    private Book books[];
    private int booksIn = 0;
    private int numberOfBooks;

    // First Constructer
    public Library(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
        books = new Book[numberOfBooks];
    }

    // Second Constructer
    public Library(Book[] books) {
        // consider the library is full
        // booksIn = numberOfBooks;
        this.books = books;
        numberOfBooks = books.length;
        booksIn = numberOfBooks;
    }

    public String getBooks() {
        // return this.books[];
        // String stringbooks = "";
        // for (int i = 0; i < books.length; i++) {
        // stringbooks += books[i] + "\n";
        // }
        // return stringbooks;
        return Arrays.toString(books);
    }

    public int getNumberOfBooks() {
        return this.numberOfBooks;
    }

    public int getBooksIn() {
        return this.booksIn;
    }

    public String addBook(Book book) {
        if (booksIn < numberOfBooks) {
            books[booksIn] = book;
            booksIn++;
        } else {
            System.out.println("Sorry, The Library is Full Now");
        }
        return "";
    }

    public Book findBook(String bookTitle) {
        for (int i = 0; i < books.length; i++)
            if (books[i].getTitle().equals((bookTitle)))
                return books[i];
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                " books[]='" + getBooks() + "'" +
                ", numberOfBooks='" + getNumberOfBooks() + "'" +
                ", booksIn='" + getBooksIn() + "'" +
                "}";
    }

}