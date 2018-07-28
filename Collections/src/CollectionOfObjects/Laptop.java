package CollectionOfObjects;
//class which implements the laptop entities
class Laptop{
	
	//Instance members
	private String company;
	private String model;
	private String OperatingSystem;
	private String processor;
	
	public Laptop(String company,String model,String OperatingSystem,String processor)
	{
		this.company=company;
		this.model=model;
		this.OperatingSystem=OperatingSystem;
		this.processor=processor;
	}

	public String getCompany() {			//using getters
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public String getProcessor() {
		return processor;
	}
}
