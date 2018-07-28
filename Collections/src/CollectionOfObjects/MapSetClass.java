package CollectionOfObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSetClass {
	
	public static void main(String args[])
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Arijit", "Litchi");
		map.put("Amit", "Banana");
		map.put("Rohit", "Apple");
		map.put("Rajiv", "Pomegranate");
		System.out.println(map.get("Arijit"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		Set<Entry<String,String>> set=map.entrySet();
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		}
	}


