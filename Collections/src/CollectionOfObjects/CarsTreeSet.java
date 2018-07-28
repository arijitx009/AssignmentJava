package CollectionOfObjects;

import java.util.Set;
import java.util.TreeSet;

public class CarsTreeSet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Car> cars = new TreeSet<Car>();
		//adding in random order of make...
		cars.add(new Car("Honda","City",2004,1000000));
		cars.add(new Car("Volkswagen","Vento",2009,750000));
		cars.add(new Car("Audi","R8",2016,15000000));
		cars.stream().forEach((c)->System.out.println(c));;
		}

}
