package dbMovies;

public class Movie {
    int Id;
    String name;
    String genre;
    String description;
    int starsCount;

    public Movie() {
    }

    public Movie(int id, String name, String genre, String description, int starsCount) {
        Id = id;
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.starsCount = starsCount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStarsCount() {
        return starsCount;
    }

    public void setStarsCount(int starsCount) {
        this.starsCount = starsCount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", starsCount=" + starsCount +
                '}';
    }
}
