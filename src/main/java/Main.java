import Models.MovieLibrary;

import java.io.IOException;
import java.util.List;

import static Helpers.Helpers.getIntFromUser;
import static Helpers.MapperJson.deserializedJsonList;
import static Helpers.Printer.printMenu;
import static Models.MovieLibrary.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        ObjectMapper mapper = new ObjectMapper();
//        File jsonFile = new File("src/main/resources/movies.json");
//
//        List<Movie> listOfMovies = mapper.readValue(jsonFile, new TypeReference<>() {
//        });

        List<MovieLibrary> listOfMovies = deserializedJsonList();

            printMenu();
            int option = getIntFromUser();
            switch (option) {
                case 1 -> findAFilmsInDateRange();
                case 2 -> randomMovie();
                case 3 -> findActorMovies();
                case 4 -> {
                    System.out.println("Thank you ! Have a nice day !");
                    System.exit(0);
                }
                default -> System.out.println("The option you choose, doesn't exist. Please try again");
            }
    }
}

