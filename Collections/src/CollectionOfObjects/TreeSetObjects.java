package CollectionOfObjects;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetObjects {
	
	public static void main(String args[])
	{
		Set<String> name=new TreeSet<String>();
		name.add("Arijit");
		name.add("Rohit");
		name.add("Andy");
		name.add("Souvik");
		name.stream().forEach((naam)->System.out.println(naam));
		
		

		
	}

}
