package dbMovies;

public class MovieRequest {
    int id;
    String name;
    String genre;
    String desc;
    int stars;

    public MovieRequest(int i, String name, String genre, String desc, int stars) {
        this.id = i;
        this.name = name;
        this.genre = genre;
        this.desc = desc;
        this.stars = stars;
    }

    public int getId() {
        return id;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public MovieRequest() {

    }
}
