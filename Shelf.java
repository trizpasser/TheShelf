package trizq;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Shelf {
    Scanner scan = new Scanner(System.in);
    HashMap<String, Book> books = new HashMap<>(); //key: title
    HashMap<String, Author> authors = new HashMap<>(); //key: name

    public void addBook() {
        Author author;

        System.out.print("\nTitle: ");
        String title = scan.nextLine();

        System.out.print("Author: ");
        String name = scan.nextLine();

        if(books.get(title) != null) {
           if(Objects.equals(books.get(title).getAuthor().getName(), name)) {
               System.out.print("\nA book with same title and author already exists.");
               System.out.print("\nAdd new book anyway? (Y/N)\n");
               String doIt = scan.nextLine();

               if(doIt.equals("N")) {
                   return;
               }
           }
        }

        if(authors.get(name) == null) {
            author = new Author(name);
            authors.put(name, author);
        }
        else {
            author = authors.get(name);
        }

        System.out.print("Publisher: ");
        String publisher = scan.nextLine();

        System.out.print("Publishing year: ");
        int publishingYear = scan.nextInt();

        System.out.print("Number of pages: ");
        int numberOfPages = scan.nextInt();
        scan.nextLine();

        Book newBook = new Book(title, publisher, author, publishingYear, numberOfPages);
        books.put(title, newBook);
        authors.get(name).addBookWrote(newBook);

        System.out.print("\n~Book on the shelf~\n");
    }


    //remover da estante
    //adicionar a estante
    //pesquisar por titulo
    //pesquisar por autor
    //escolher um livro aleatorio não lido
    //retornar a razão de livros lidos e livros não lidos
    //quantida de páginas lidas
}
