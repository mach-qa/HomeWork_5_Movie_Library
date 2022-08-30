package Models;

import java.util.List;

public class MovieLibrary {

    private List<Movie> movies;

    @Override
    public String toString() {
        return "MovieLibrary{" +
                "movies=" + movies +
                '}';
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
