import java.util.ArrayList;

public class NetflixOrigin {
	public static void main(String[] args) {
		Movie m1 = new Movie("Java", 5);
		Movie m2 = new Movie("Twilight", 1);
		Movie m3 = new Movie("C++", 3);
		Movie m4 = new Movie("Python", 2);
		Movie m5 = new Movie("Boo", 4);
		
		System.out.println(m1.getTicketPrice());
		System.out.println(m2.getTicketPrice());
		System.out.println(m3.getTicketPrice());
		System.out.println(m4.getTicketPrice());
		System.out.println(m5.getTicketPrice());
		
		System.out.println("");

		NetflixQueue nq1 = new NetflixQueue();
		
		nq1.addMovie(m1);
		nq1.addMovie(m2);
		nq1.addMovie(m3);
		nq1.addMovie(m4);
		nq1.addMovie(m5);
		nq1.printMovies();
		
		System.out.println("");
		
		System.out.println("The best movie is " + nq1.getBestMovie());
		System.out.println("The second best movie is " + nq1.get2ndBestMovie());
	}
}
