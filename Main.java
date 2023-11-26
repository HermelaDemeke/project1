
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*this is the main class that define the entry point, this will be a method called main that is invoked at the end of your file. This method should do the following:
Present the user with a list of options to perform.
Letting users to choose an option.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        App app = new App();
        while (!quit) {
            System.out.println("****************WELCOME TO SCHOOL LIBRARY*****************");
            System.out.println("Choose an option:");
            System.out.println("1. List all books");
            System.out.println("2. List all people");
            System.out.println("3. Create a person");
            System.out.println("4. Create a book");
            System.out.println("5. Create a rental");
            System.out.println("6. List rentals for a person");
            System.out.println("7. Quit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    App.listAllBooks();
                    break;
                case 2:
                    app.listAllPeople();
                    break;
                case 3:
                    app.createPerson();
                    break;
                case 4:
                    app.createBook();
                    break;
                case 5:
                    app.createRental();
                    break;
                case 6:
                    app.listRentalsForPerson();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

}
