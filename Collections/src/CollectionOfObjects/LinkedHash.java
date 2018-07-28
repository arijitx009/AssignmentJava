package CollectionOfObjects;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {
public static void main(String args[])
{
	Set<String> name=new LinkedHashSet<String>();
	name.add("Arijit");
	name.add("Rohit");
	name.add("Andy");
	name.add("Souvik");
	name.stream().forEach((naam)->System.out.println(naam));
	
	

	
}
}
