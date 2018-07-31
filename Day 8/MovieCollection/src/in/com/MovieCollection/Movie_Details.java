package in.com.MovieCollection;


//to implement the entities of the class
public class Movie_Details{
	 

	 String mov_Name;
	 String lead_Actor;
	 String lead_Actress;
	 String genre;
	
	
	public Movie_Details(String mov_Name, String lead_Actor,String lead_Actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.genre = genre;
		this.lead_Actress=lead_Actress;
	}


	public String getMov_Name() {
		return mov_Name;
	}


	public String getLead_Actor() {
		return lead_Actor;
	}


	public String getLead_Actress() {
		return lead_Actress;
	}


	public String getGenre() {
		return genre;
	}


	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_Actor=" + lead_Actor + ", lead_Actress=" + lead_Actress
				+ ", genre=" + genre + "]";
	}
	
	
	
	

}
