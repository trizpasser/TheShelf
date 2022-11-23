package trizq;

import java.util.ArrayList;

public class Author {
    String name;
    ArrayList<Book> booksWrote;

    public Author(String name) {
        this.name = name;
    }

    public void addBookWrote(Book book) {
        booksWrote.add(book);
    }

    public void removeBook(int index) {
        booksWrote.remove(index);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooksWrote() {
        return booksWrote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooksWrote(ArrayList<Book> booksWrote) {
        this.booksWrote = booksWrote;
    }
}
