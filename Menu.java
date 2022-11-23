package trizq;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Shelf shelf = new Shelf();


    public void mainMenu() {
        int option;

        do {
            System.out.print("\n");
            System.out.println("----------------------------------------------------");
            System.out.println("|                      Main Menu                   |");
            System.out.println("----------------------------------------------------");
            System.out.println("|  1. Add book               |  6. Page counter    |");
            System.out.println("|  2. Search book or author  |  7. To Read         |");
            System.out.println("|  3. ............           |  8. .........       |");
            System.out.println("|  4. .....................  |  9. ..............  |");
            System.out.println("|  5. Random selection       |                     |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     10. End                      |");
            System.out.println("----------------------------------------------------");

            option = scan.nextInt();

            switch (option) {
                case 1: shelf.addBook();
                    break;
                case 2: shelf.searchBookOrAuthor();
                    break;
                case 3: ;
                    break;
                case 10: break;
                default:
                    System.out.println("Try again.");
            }
        } while (option != 10);
    }

    public void bookMenu(Book book) {
        int option;

        do {
            System.out.print("\n");
            System.out.println("--------------------------------------------------");
            System.out.println("|                      Book Menu                 |");
            System.out.println("--------------------------------------------------");
            System.out.println("|  1. Remove book          |  6. .............   |");
            System.out.println("|  2. Mark as read/unread  |  7. ........        |");
            System.out.println("|  3. Put in To Read List  |  8. .........       |");
            System.out.println("|  4. Page track           |  9. ..............  |");
            System.out.println("|  5. Edit info            |                     |");
            System.out.println("|------------------------------------------------|");
            System.out.println("|                    10. Return                  |");
            System.out.println("--------------------------------------------------");

            option = scan.nextInt();

            switch (option) {
                case 1: shelf.removeBook(book);
                    break;
                case 2: shelf.setReadOrUnread(book);
                    break;
                case 3: ;
                    break;
                case 4: shelf.updateCurrentPage(book);
                    break;
                case 10: break;
                default:
                    System.out.println("Try again.");
            }
        } while (option != 10);
    }
}
