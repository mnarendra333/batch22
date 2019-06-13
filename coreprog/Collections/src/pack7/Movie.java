package pack7;

public class Movie {

	@Override
	public String toString() {
		return "Movie [heroName=" + heroName + ", movieName=" + movieName + ", year=" + year + "]";
	}

	private String heroName;

	private String movieName;

	private int year;

	public Movie(String heroName, String movieName, int year) {
		super();
		this.heroName = heroName;
		this.movieName = movieName;
		this.year = year;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getYear() {
		return year;
	}

}
