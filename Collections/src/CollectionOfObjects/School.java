package CollectionOfObjects;

public class School {

	
	private String name;
	private String city;
	private String district;
	private int greatSchoolRanking;
	
	public School(String name,String city,String district,int greatSchoolRanking)
	{
		this.name=name;
		this.city=city;
		this.district=district;
		this.greatSchoolRanking=greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

		
	
}
