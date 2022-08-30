package Helpers;

import Models.Movie;
import java.util.List;
import java.util.Objects;

import static Helpers.Helpers.getIntFromUser;
import static Helpers.Helpers.getStringFromUser;

public class Printer {
    public static void printMenu () {
        System.out.println("Please Choose one of the options");
        System.out.println("1 - Enter two dates to display the names of films recorded between these dates");
        System.out.println("2 - Display all information about a random film");
        System.out.println("3 - Enter the actor's name to display the names of the films he has appeared in");
    }

    public static void findAFilmsInDateRange (List<Movie> movieList) {
        System.out.println("Please provide first year");
        int firstYear = getIntFromUser();
        System.out.println("Please provide second year");
        int secondYear = getIntFromUser();

        System.out.println("Movies that was released between these years:");
        for (Movie movie : movieList) {
            if (firstYear <= movie.getYearOfDistribution() && secondYear >= movie.getYearOfDistribution()) {
                System.out.println(movie.getMovieTitle());
            }
        }
    }

    public static void findActorMovies (List<Movie> movieList) {
        System.out.println("Please provide actor first name");
        String actorFirstName = getStringFromUser();
        System.out.println("Please provide actor second name");
        String actorSecondName = getStringFromUser();

        for ( Movie movie : movieList ) {
            for (int i = 0; i < movie.getListOfMovieActors().size(); i++) {
                if (Objects.equals(actorFirstName, movie.getListOfMovieActors().get(i).getFirstName())
                        && Objects.equals(actorSecondName, movie.getListOfMovieActors().get(i).getLastName())) {
                    System.out.println(movie.getMovieTitle());
                }
            }
        }
    }
}
