package in.com.MovieCollection;

import java.util.Comparator;

public class SortingByMovieName implements Comparator<Movie_Details> 
{
	
	// Used for sorting in ascending order of
	// Movie_Name
	public int compare(Movie_Details Goal, Movie_Details HNY) // Overriding Compare method
	{
	return Goal.getMov_Name().compareTo(HNY.getMov_Name());
	}
	}	
class SortbyLead_Actor implements Comparator<Movie_Details>
{
// Used for sorting in ascending order of
// Lead_Actor
public int compare(Movie_Details RangDEBasanti, Movie_Details HNY)
{
return RangDEBasanti.getLead_Actor().compareTo(HNY.getLead_Actor());
}
}
class SortbyLead_Actress implements Comparator<Movie_Details>
{
// Used for sorting in ascending order of
// Lead_Actress
public int compare(Movie_Details Goal, Movie_Details RangDEBasanti)
{
return Goal.getLead_Actress().compareTo(RangDEBasanti.getLead_Actress());
}
}
class SortbyGenre implements Comparator<Movie_Details>
{
// Used for sorting in ascending order of
// Genre
public int compare(Movie_Details Goal, Movie_Details HNY)
{
return Goal.getGenre().compareTo(HNY.getGenre());
}
}

