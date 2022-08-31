package Models;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import static Helpers.Helpers.*;

public class MovieLibrary {

    private static List<Movie> moviesList;
    private String movies;

    public MovieLibrary() {
    }

    public static void findAFilmsInDateRange() {
        System.out.println("Please provide the lowest require year");
        int lowerYear = getIntFromUser();
        System.out.println("Please provide the highest require year");
        int higherYear = getIntFromUser();

        System.out.println("Movies released between these years are:");
        for (Movie movie : moviesList) {
            if (lowerYear <= movie.getDate() && higherYear >= movie.getDate()) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public static void randomMovie() {
        Random random = new Random();
        System.out.println(moviesList.get(random.nextInt(moviesList.size()))
                .toString()
                .replaceAll("[\\[\\](){}]", ""));
    }

    public static void findActorMovies() {
        System.out.println("Please provide actor first name");
        String actorFirstName = getStringFromUser();
        System.out.println("Please provide actor second name");
        String actorLastName = getStringFromUser();

        for (Movie movie : moviesList) {
            for (int i = 0; i < movie.getActors().size(); i++) {
                if (Objects.equals(actorFirstName, movie.getActors().get(i).getFirstName())
                        && Objects.equals(actorLastName, movie.getActors().get(i).getLastName())) {
                    System.out.println(movie.getTitle());
                }
            }
        }
    }

    public MovieLibrary(List<Movie> movies) {
        MovieLibrary.moviesList = movies;
    }

    public List<Movie> getMovies() {
        return moviesList;
    }

    public void setMovies(List<Movie> movies) {
        MovieLibrary.moviesList = movies;
    }
}
