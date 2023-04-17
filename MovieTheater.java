package encapsulation;

class movie{
	//private data member 
	private String movieName;
    private float movieStartTime;
    private float movieEndTime;
    private double movieTicketPrice;
    
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(float movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public float getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(float movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	public double getMovieTicketPrice() {
		return movieTicketPrice;
	}
	public void setMovieTicketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}   
}

public class MovieTheater {
	public static void main(String[] args) {
		movie m=new movie();
		m.setMovieName("ABC");
		m.setMovieStartTime(8.00f);
		m.setMovieEndTime(11.00f);
		m.setMovieTicketPrice(1000);
		System.out.println(m.getMovieName()+" "+m.getMovieStartTime()+" "+m.getMovieEndTime()+" "+m.getMovieTicketPrice());
	}

}
 