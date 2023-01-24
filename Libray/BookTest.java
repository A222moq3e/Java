public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("Cryptography", 350, new Author("A222", "a222ghoul@gmail.com"));
        System.out.println(book1.getTitle());
        System.out.println(book1.getNumberOfPages());
        System.out.println(book1.getAuthor());
        System.out.println(book1);
    }
}
