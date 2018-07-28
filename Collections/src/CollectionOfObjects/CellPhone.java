package CollectionOfObjects;
//class which implements cellphone
class CellPhone{
	
	//Instance members
	private String company;
	private String model;
	private String description;
	private String OperatingSystem;
	private int price;
	
	public CellPhone(String company,String model,String OperatingSystem,String description,int price)
	{
		this.company=company;
		this.model=model;
		this.OperatingSystem=OperatingSystem;
		this.description=description;
		this.price=price;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getDescription() {
		return description;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public int getPrice() {
		return price;
	}

	
}

