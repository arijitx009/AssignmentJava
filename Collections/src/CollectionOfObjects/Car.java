package CollectionOfObjects;
//class which implements the car entities
class Car implements Comparable<Car>{
	
	//Instance members
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(String make,String model,int year,double price)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}

	public String getMake() {		//use of getters
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Car arg0) {
		// TODO Auto-generated method stub
		return this.make.compareTo(arg0.make);
	}

	
}
