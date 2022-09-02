package Models;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import static Helpers.UserInputHelpers.getIntFromUser;
import static Helpers.UserInputHelpers.getStringFromUser;

public class MovieLibrary {

    private List<Movie> movies;

    public MovieLibrary() {
    }

    public void findAFilmsInDateRange(int lowerYear, int higherYear) {
        System.out.println("Movies released between these years are:");
        for (Movie movie : movies) {
            if (lowerYear <= movie.getDate() && higherYear >= movie.getDate()) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void randomMovie() {
        Random random = new Random();
        System.out.println(movies.get(random.nextInt(movies.size()))
                .toString()
                .replaceAll("[\\[\\](){}]", ""));
    }

    public void findActorMovies(String actorFirstName, String actorLastName) {
        for (Movie movie : movies) {
            for (int i = 0; i < movie.getActors().size(); i++) {
                if (actorFirstName.equals(movie.getActors().get(i).getFirstName())
                        && actorLastName.equals(movie.getActors().get(i).getLastName())) {
                    System.out.println(movie.getTitle());
                }
            }
        }
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
