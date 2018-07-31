package in.com.MovieCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class MovieDetailsList  {
	//creating arrayList



	List<Movie_Details> arrayList=new ArrayList<>();

	// Add method to add a movie in ArrayList
	public void add_movie(Movie_Details arijit) {
		
		arrayList.add(arijit);
		System.out.println("\nAfter Adding Movie : " + arijit.getMov_Name());
		// printing ArrayList
		arrayList.stream().forEach((arraylistlist) -> System.out.println("Movie Name- " +arijit.getMov_Name() + "Lead Actor "
				+arijit.getLead_Actor() + "Genre " +arijit.getGenre()));
	}


	public void remove_movie(Movie_Details arijit) {
		arrayList.remove(arijit);
		System.out.println("\nAfter Removing Movie : " + arijit.getMov_Name());
		arrayList.stream().forEach((arraylistlist) -> System.out.println(arraylistlist));// printing ArrayList
	}
	// Remove method to remove all movies
	public void remove_AllMovies() {
		arrayList.removeAll(arrayList);
		System.out.println("\nAfter Removing All Movies ");
		arrayList.stream().forEach((arraylistlist) -> System.out.println(arraylistlist));
	}
	// find by name method to find movie object by name Name Attribute
	public Movie_Details find_by_movie_name(String Movie_Name) {
		for (Movie_Details movie : arrayList) {
			if (movie.getMov_Name().equals(Movie_Name)) { // if Movie Name is Equal to passes movie name then return
				// object of that movie
				return movie;
			}

		}
		return null;
	}
	public Movie_Details find_by_movie_Genre(String Movie_Genre) {
		for (Movie_Details movie : arrayList) {
			if (movie.getGenre().equals(Movie_Genre)) { // if Movie Genre Equal to passes movie Genre then return object
				// of that movie
				return movie;
			}
		}
		return null;
	}
	public void SortingParameter(String parameter) {
		if (parameter.equals("mov_Name")) { // if Passed parameter is equal to Movie_Name
			Collections.sort(arrayList, new SortingByMovieName());// Call sort method of Collections with arrayList and
			// object of Required class which implements
			// Comparator
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));
		} else if (parameter.equals("lead_Actor")) { // if Passed parameter is equal to Lead_Actor
			Collections.sort(arrayList, new SortbyLead_Actor()); // Call sort method of Collections with arrayList and
			// object of Required class which implements
			// Comparator
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));
		} else if (parameter.equals("lead_Actress")) {
			Collections.sort(arrayList, new SortbyLead_Actress());
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));
		} else if (parameter.equals("Genre")) {
			Collections.sort(arrayList, new SortbyGenre());
			arrayList.stream().forEach((arrayListList) -> System.out.println(arrayListList));
		} else {
			System.out.println("Invalid Parameter Entered");
		}
	}


}

