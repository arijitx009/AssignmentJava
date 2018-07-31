package in.com.MovieCollection;

import java.util.Scanner;

public class Movie_Details_Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Creating Object of Movie_Details
		Movie_Details RangDEBasanti = new Movie_Details("RangDEBasanti","Amir Khan","Soha Ali Khan", "Action");
		Movie_Details HNY = new Movie_Details("HNY","SRK","Deepika", "Dance");
		Movie_Details Goal = new Movie_Details("Goal", "John", "Bipasha", "Sports");
		//Creating Objects of Movie_DetailList which will Maintain Movie_Details
		MovieDetailsList movie_DetailsList = new MovieDetailsList();
		//1.Adding 3 Movies
		movie_DetailsList.add_movie(RangDEBasanti);
		movie_DetailsList.add_movie(HNY);
		movie_DetailsList.add_movie(Goal);
		//2.Removing a Movie
		movie_DetailsList.remove_movie(Goal);
		//3.Removing all Movies
		movie_DetailsList.remove_AllMovies();
		//4.Adding 2 Movies
		movie_DetailsList.add_movie(HNY);
		movie_DetailsList.add_movie(Goal);
		//Searching on the basis of Movie Name
		System.out.println("\nBy Name HNY : " +movie_DetailsList.find_by_movie_name("HNY"));
		//Searching on the Basis of Movie Genre
		System.out.println("\nBy Genre Sports : "+movie_DetailsList.find_by_movie_Genre("Sports"));
		//Asking for Parameter from User to Sort
		System.out.println("\nEnter The Parameter you want to sort with Like : 1.Movie_Name 2.Lead_Actor 3.Lead_Actress 4.Genre");
		String parameter = scanner.next();
		movie_DetailsList.SortingParameter(parameter);//Passing Parameter
	}

}
