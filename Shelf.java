package trizq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Shelf {
    Scanner scan = new Scanner(System.in);
    HashMap<String, Book> books = new HashMap<>(); //key: title
    HashMap<String, Author> authors = new HashMap<>(); //key: name
    ArrayList<String> searchList = new ArrayList<>();

    public void addBook() {
        Author author;
        ArrayList<Book> booksWrote = new ArrayList<>();

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

        System.out.print("Publisher: ");
        String publisher = scan.nextLine();

        System.out.print("Publishing year: ");
        int publishingYear = scan.nextInt();

        System.out.print("Number of pages: ");
        int numberOfPages = scan.nextInt();
        scan.nextLine();

        if(authors.get(name) == null) {
            author = new Author(name);
            authors.put(name, author);
            searchList.add(author.getName());
        }
        else {
            author = authors.get(name);
            booksWrote = authors.get(name).getBooksWrote();
        }

        Book newBook = new Book(title, publisher, author, publishingYear, numberOfPages);
        books.put(title, newBook);
        booksWrote.add(newBook);
        authors.get(name).setBooksWrote(booksWrote);

       searchList.add(newBook.getTitle());
        //authors.get(name).addBookWrote(newBook);

        System.out.print("\n~Book on the shelf~\n");
    }
    
    public void searchBookOrAuthor() {
        int position;
        int located;

        do {
            System.out.println("Search title or author: ");
            String keyWord = scan.nextLine();
            
          located = locateKeyWord(keyWord);

          if(located == -2) {
              return;
          } else if (located >= 0) {
              String bookOrAuthor = searchList.get(located);
              if(books.get(bookOrAuthor) != null) {
                  accessBookMenu(books.get(bookOrAuthor));
              } else {
                  //accessAuthorMenu(authors.get(bookOrAuthor));
              }
          }


        } while(located == -1);

    }

    public int locateKeyWord(String keyWord) {
        int[] located = new int[searchList.size()];
        int counter = 0, position, finalPosition;

        for(int i = 0; i < searchList.size(); i++) {
            String searchKeyWord = searchList.get(i);
            int index = searchKeyWord.indexOf(keyWord);

            //tratar para letras em minusculo
            //add mensagem de não encontrado
            //organizar mostrando autores primeiro

            if (index != -1) {
                located[counter] = i;
                System.out.println(counter+1 + ". " + searchList.get(i));
                counter++;
            }
        }

        do {
            System.out.println("Insert position or type -1 to try again or type -2 to return: ");
            position = scan.nextInt();
            scan.nextLine();
        } while(position < -2);

        if (position > 0) {
            finalPosition = located[position-1];
        }
        else {
            finalPosition = position;
        }
        
        return finalPosition;
    }

    /*public void removeBook(Book book) {

    }*/

    public void accessBookMenu(Book book) {
        System.out.println();
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getPublisher());
        System.out.println(book.getPublishingYear());

        if (book.wasRead()) {
            System.out.println("Read");
        } else {
            System.out.println("Not read");
        }

        if (book.getNumberOfPagesRead() > 0) {
            System.out.print(book.getNumberOfPagesRead() + "/" + book.getNumberOfPages() + " (");
            System.out.print(book.getNumberOfPagesRead() * 100 / book.getNumberOfPages() + "%)");
        }

        Menu menu = new Menu();
        menu.bookMenu(book);
    }

    public void updateCurrentPage(Book book) {
        boolean invalidInput;
        int numberOfPagesRead;

        do {
            invalidInput = false;

            System.out.print("\nCurrent page: ");
            numberOfPagesRead = scan.nextInt();
            scan.nextLine();

            if (numberOfPagesRead < 0 || numberOfPagesRead > book.getNumberOfPages()) {
                System.out.println("Invalid number");
                invalidInput = true;
            }
        } while (invalidInput);

         if(numberOfPagesRead == book.getNumberOfPages()) {
             book.setRead();
         }

         book.setNumberOfPagesRead(numberOfPagesRead);
    }


    public void setReadOrUnread(Book book) {
        if (book.wasRead()) {
            book.setUnread();
        } else {
            book.setRead();
        }
    }



    public void toRead() {
        /*implementar uma fila dupla circular(?)
         preciso aplicar uma fila que possa mudar as prioridades e remover qualquer posição*/
    }


    //remover da estante
    //adicionar a estante
    //pesquisar por titulo - como identificar uma palavra presente numa string?
    //pesquisar por autor
        //depois de encontrar o livro ele deve mostrar todas as informações assim como se foi lido + menu do livro
    //escolher um livro aleatorio não lido
    //retornar a razão de livros lidos e livros não lidos
    //quantida de páginas lidas
    //lido/não lido
    //to read
        //pode ser definido por data, como metas "read till date dd/mm/yyyy
}
