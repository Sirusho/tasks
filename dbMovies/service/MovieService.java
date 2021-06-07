package dbMovies;

import dbMovies.controller.model.MovieRequest;

public class MovieService {
    Database database = new Database();

    void createMovie(MovieRequest movieRequest) {
        System.out.println(database.list.add(new Movie(movieRequest.id,
                movieRequest.name,
                movieRequest.genre,
                movieRequest.desc,
                movieRequest.stars)));

    }

    void readAll() {
        System.out.println(database.list.toString());
    }

    void delete(int i) {
        database.list.remove(i);
    }

    void update(MovieRequest movieRequest, int i) {
        if (i > database.list.size() || i < 0) {
            throw new IndexOutOfBoundsException("Index is not valid");
        }
        Movie movie = database.list.get(i);
        if (!movieRequest.name.equals("")) {
            movie.setName(movieRequest.name);
        }
        if (!movieRequest.genre.equals("")) {
            movie.setGenre(movieRequest.genre);
        }
        if (!movieRequest.desc.equals("")) {
            movie.setDescription(movieRequest.desc);
        }
        if (movieRequest.stars > 0) {
            movie.setStarsCount(movieRequest.stars);
        }
    }


    void readById(int i) {
        System.out.println(database.list.get(i));
    }
}

