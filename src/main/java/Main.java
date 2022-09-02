import Models.MovieLibrary;

import java.io.IOException;

import static Helpers.UserInputHelpers.getIntFromUser;
import static Helpers.MapperJson.deserializedJson;
import static Helpers.Printer.printMenu;
import static Helpers.UserInputHelpers.getStringFromUser;

public class Main {
    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = deserializedJson("src/main/resources/movies.json");

        printMenu();
        int option = getIntFromUser();
        switch (option) {
            case 1 -> {
                System.out.println("Please provide the lowest require year");
                int lowerYear = getIntFromUser();
                System.out.println("Please provide the highest require year");
                int higherYear = getIntFromUser();
                movieLibrary.findAFilmsInDateRange(lowerYear, higherYear);
            }
            case 2 -> movieLibrary.randomMovie();
            case 3 -> {
                System.out.println("Please provide actor first name");
                String actorFirstName = getStringFromUser();
                System.out.println("Please provide actor second name");
                String actorLastName = getStringFromUser();

                movieLibrary.findActorMovies(actorFirstName, actorLastName);
            }
            case 4 -> {
                System.out.println("Thank you ! Have a nice day !");
                System.exit(0);
            }
            default -> System.out.println("The option you choose, doesn't exist. Please try again");
        }
    }
}

