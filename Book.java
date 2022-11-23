package trizq;

public class Book {
    String title, publisher;
    Author author;
    int publishingYear, numberOfPages, numberOfPagesRead = 0;
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

    public int getNumberOfPagesRead() {
        return numberOfPagesRead;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setNumberOfPagesRead(int numberOfPagesRead) {
        this.numberOfPagesRead = numberOfPagesRead;
    }

    public boolean wasRead() {
        return read;
    }

    public void setRead() {
        this.read = true;
    }
    public void setUnread() {
        this.read = false;
    }
}
