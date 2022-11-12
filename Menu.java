package trizq;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Shelf shelf = new Shelf();


    public void mainMenu() {
        int option;

        do {
            System.out.print("\n");
            System.out.println("-----------------------------------------------");
            System.out.println("|                   Main Menu                 |");
            System.out.println("-----------------------------------------------");
            System.out.println("|  1. Add book          |  6. Page counter    |");
            System.out.println("|  2. Remove book       |  7. ...             |");
            System.out.println("|  3. Search by title   |  8. .........       |");
            System.out.println("|  4. Search by author  |  9. ..............  |");
            System.out.println("|  5. Random selection  |                     |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|                    10. End                  |");
            System.out.println("-----------------------------------------------");

            option = scan.nextInt();

            switch (option) {
                case 1: shelf.addBook();
                    break;
                case 2: ;
                    break;
                case 3: ;
                    break;
                case 10: break;
                default:
                    System.out.println("Try again.");
            }
        } while (option != 10);
    }
}
