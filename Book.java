package trizq;

public class Book {
    String title, publisher;
    Author author;
    int publishingYear, numberOfPages;
    boolean read = false;

    public Book(String title, String publisher, Author author, int publishingYear, int numberOfPages) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean wasRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
