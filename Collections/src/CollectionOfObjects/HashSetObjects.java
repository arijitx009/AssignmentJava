package CollectionOfObjects;


import java.util.HashSet;

import java.util.Set;
public class HashSetObjects {

	public static void main(String args[])
	{
		//hash set not accepting two duplicate values
		Set<Laptop> laptop=new HashSet<Laptop>();
		laptop.add(new Laptop("HP","HPB612","Windows10","Corei3"));
		laptop.add(new Laptop("lenovo","LC138","Windows10","Corei7"));
		laptop.add(new Laptop("Apple", "Mac Book Pro", "OsX", "A9"));
		laptop.add(new Laptop("Apple", "Mac Book Pro", "OsX", "A9"));//Duplicate Value
		for(Laptop lappy:laptop)
		{
			System.out.println(lappy.getCompany());
			System.out.println(lappy.getModel());
			System.out.println(lappy.getOperatingSystem());
			System.out.println(lappy.getProcessor());

		}
		// Hash set not accepting two duplicate CellPhone values
		Set<CellPhone> cp = new HashSet<CellPhone>();
		cp.add(new CellPhone("Samsung","j6","Android","Oreo",16000));
		cp.add(new CellPhone("Apple","IphoneX","IOS","Os9",78000));
		cp.add(new CellPhone("Xiaomi","Note5","Android","Oreo",15000));
		cp.add(new CellPhone("Xiaomi","Note5","Android","Oreo",15000));// Duplicate
		// values
		System.out.println("The Cellphones are ");
		for(CellPhone c:cp)
		{
			System.out.println(c.getCompany());
			System.out.println(c.getModel());
			System.out.println(c.getDescription());
			System.out.println(c.getOperatingSystem());
			System.out.println(c.getPrice());


		}
	}

}
