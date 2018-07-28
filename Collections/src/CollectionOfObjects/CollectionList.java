package CollectionOfObjects;

import java.util.List;
import java.util.ArrayList;

public class CollectionList {

	public static void printlaptops()
	{
		List<Laptop> laptop=new ArrayList<Laptop>();
		
		
		laptop.add(new Laptop("HP","HPB612","Windows10","Corei3"));
		laptop.add(new Laptop("lenovo","LC138","Windows10","Corei7"));
		laptop.add(new Laptop("Apple","MacBookPro","OSx","A9"));
		
		System.out.println("The laptops are");
		
		for(Laptop lappy:laptop)
		{
			System.out.println(lappy.getCompany());
			System.out.println(lappy.getModel());
			System.out.println(lappy.getOperatingSystem());
			System.out.println(lappy.getProcessor());
			
		}
			
	}
	
	public static void printCar()
	{
		List<Car> car=new ArrayList<Car>();
		
		
		car.add(new Car("Honda","City",2004,1000000));
		car.add(new Car("Volkswagen","Vento",2009,750000));
		car.add(new Car("Audi","R8",2016,15000000));
		
		System.out.println("The cars are");
		
		for(Car cab:car)
		{
			System.out.println(cab.getMake());
			System.out.println(cab.getModel());
			System.out.println(cab.getYear());
			System.out.println(cab.getPrice());
			
		}
			
	}
	
	public static void printCellPhone()
	{
		List<CellPhone> cp=new ArrayList<CellPhone>();
		
		
		cp.add(new CellPhone("Samsung","j6","Android","Oreo",16000));
		cp.add(new CellPhone("Apple","IphoneX","IOS","Os9",78000));
		cp.add(new CellPhone("Xiaomi","Note5","Android","Oreo",15000));
		
		System.out.println("The cellphones are");
		
		for(CellPhone c:cp)
		{
			System.out.println(c.getCompany());
			System.out.println(c.getModel());
			System.out.println(c.getDescription());
			System.out.println(c.getOperatingSystem());
			System.out.println(c.getPrice());
			
			
		}
			
	}
	public static void printTelevision()
	{
		List<Television> tv=new ArrayList<Television>();
		
		
		tv.add(new Television("LG","LED",true,76000));
		tv.add(new Television("Samsung","LCD",false,58000));
		tv.add(new Television("Onida","LED",false,25000));
		
		System.out.println("The televisions are");
		
		for(Television t:tv)
		{
			System.out.println(t.getCompany());
			System.out.println(t.getType());
			System.out.println(t.isEnable3d());
			System.out.println(t.getPrice());
			
			
			
		}
	
	
	}
	
	public static void printSchool()
	{
		List<School> sc=new ArrayList<School>();
		
		
		sc.add(new School("FAPS","Kolkata","Bengal",1));
		sc.add(new School("St.James","Bangalore","Karanataka",2));
		sc.add(new School("DPS","Bokaro","Dhanbad",3));
		
		System.out.println("The Schools are");
		
		for(School s:sc)
		{
			System.out.println(s.getName());
			System.out.println(s.getCity());
			System.out.println(s.getDistrict());
			System.out.println(s.getGreatSchoolRanking());
			
			
			
		}
	
	
	}
}
