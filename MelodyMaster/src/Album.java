import java.time.LocalDate;

public class Album {
	private String title;
	private String artist;
	private LocalDate releaseDate;
	private double rating;
	private int noOfLikes;
	
	public Album() {
		super();
	}

	public Album(String title, String artist, LocalDate releaseDate, double rating, int noOfLikes) {
		super();
		this.title = title;
		this.artist = artist;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.noOfLikes = noOfLikes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	
	@Override
	public String toString() {
		return  title + "|" + artist + "|" + releaseDate + "|" + rating + "|" + noOfLikes ;
	}
	
}