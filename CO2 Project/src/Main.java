import java.util.Collections;


public class Main {
	 public static void main(String[] args) throws CloneNotSupportedException {
	        MovieCatalog catalog = new MovieCatalog();
	        catalog.addMovie(new Movie("Inception", "Christopher Nolan", 2010, "Sci-Fi", 8.8));
	        catalog.addMovie(new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action", 9.0));

	        // Sort by title
	        Collections.sort(catalog.getMovies());

	        // Sort by rating using Comparator
	        catalog.sortMovies(new MovieComparator());

	        // Clone the catalog
	        MovieCatalog clonedCatalog = (MovieCatalog) catalog.clone();

	        // Iterate over the catalog
	        for (Movie movie : catalog) {
	            System.out.println(movie.getTitle());
	        }
	    }
}