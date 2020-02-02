package classes.basics.exercise;

public class Book {
    private String title;
    private String author;
    private String publishDate;
    private String isbn;

    public Book(String title, String author, String publishDate, String isbn) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
