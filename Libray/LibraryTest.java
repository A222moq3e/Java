public class LibraryTest {
    public static void main(String[] args) {
        // Test by first Contructor
        Library library = new Library(5);
        Book book1 = new Book("Ahmed Stroy", 750, new Author("Ahemd", "Ahmed@library.com"));
        Book book2 = new Book("CyberSecurity", 350, new Author("Khalid", "Khalid@library.com"));
        Book book3 = new Book("Degital Design", 630, new Author("Yasser", "Yasser@library.com"));
        Book book4 = new Book("Cryptography", 122, new Author("Abdullah", "Abdullah@library.com"));
        Book book5 = new Book("Java Programming", 1200, new Author("Ziyad", "Ziyad@library.com"));
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library.getBooks());
        System.out.println(library.findBook("Degital Design"));
        library.addBook(book5);
        // Test by Second Constructor
        Book[] books = { book1, book4, book5 };
        Library imamuLibrary = new Library(books);
        System.out.println(imamuLibrary);
        imamuLibrary.addBook(book2);
        System.out.println(imamuLibrary.getBooks());
    }
}
