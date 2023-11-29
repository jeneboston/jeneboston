package de.ait.cinema;

public abstract class Film {
    private String title;
    private int duration;
    private int rating;
    private String genre;
    abstract void showTrailer();

    public Film(String title, int duration, int rating, String genre) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
