package Models;

import java.util.List;

public class Movie {
    private String title;
    private int date;
    private String genre;
    private Director director;
    private List<Actor> actors;

    public Movie(String title, int date, String genre, Director director, List<Actor> actors) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {}

    @Override
    public String toString() {
        return "Title: " + title +
                "\nYear: " + date +
                "\nGenre: " + genre +
                "\nDirector: " + director +
                "\nActors: " + actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}