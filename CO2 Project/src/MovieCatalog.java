import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MovieCatalog implements Cloneable, Iterable<Movie> {
	 private List<Movie> movies;

	    public MovieCatalog() {
	        this.movies = new ArrayList<>();
	    }

	    public void addMovie(Movie movie) {
	        movies.add(movie);
	    }

	    public void removeMovie(Movie movie) {
	        movies.remove(movie);
	    }

	    public List<Movie> getMovies() {
	        return movies;
	    }
	    public void sortMovies(Comparator<Movie> comparator) {
	        Collections.sort(movies, comparator);
	    }
	    
	    protected Object clone() throws CloneNotSupportedException {
	        MovieCatalog cloned = (MovieCatalog) super.clone();
	        cloned.movies = new ArrayList<>(this.movies);
	        return cloned;
	    }
	    
	    public Iterator<Movie> iterator() {
	        return movies.iterator();
	    }
}
