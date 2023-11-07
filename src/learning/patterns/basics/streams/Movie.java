package learning.patterns.basics.streams;

public class Movie {

    private String tile;
    private Integer likes;


    public Movie(String tile, Integer likes, Genre genre) {
        this.tile = tile;
        this.likes = likes;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    private Genre genre;

    public String getTile() {
        return tile;
    }

    public Movie(String tile, Integer likes) {
        this.tile = tile;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tile='" + tile + '\'' +
                ", likes=" + likes +
                '}';
    }
}
