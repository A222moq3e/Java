public class Book {
    private final String title;
    private final int numberOfPages;
    private final Author author;

    public Book(String title, int numberOfPages, Author author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }
    // public Book() {
    // this.title = "";
    // this.numberOfPages = 0;
    // this.author = new Author("", "");
    // }

    public String getTitle() {
        return this.title;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public Author getAuthor() {
        return this.author;
    }

    // "Java How to Program" by deitel [deitel@deitel.com], pp 1245)
    @Override
    public String toString() {
        return "\"" + getTitle() + "\" by " + getAuthor() + ", pp " + getNumberOfPages();
    }

}
