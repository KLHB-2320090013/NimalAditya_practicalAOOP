
public class Movie implements Comparable<Movie>, Cloneable {
	
	 private String title;
	    private String director;
	    private int releaseYear;
	    private String genre;
	    private double Rating;
	    
	public int compareTo(Movie other) {
		 return this.title.compareTo(other.title);
	}
	 protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
}
