package in.co.EmployeeCollection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	
	public static void main(String args[]) {
		
		Employee_Information emp1=new Employee_Information(101,"Arijit","Trainee",10000.00,"E");
		Employee_Information emp2=new Employee_Information(103,"Rohit","Trainer",30000.00,"B");
		Employee_Information emp3=new Employee_Information(104,"Rohan","Manager",40000.00,"A");
		Employee_Information emp4=new Employee_Information(102,"Dutta","Manager",40000.00,"A");
		Employee_Information emp5=new Employee_Information(105,"Abir","Trainee",10000.00,"E");
		
		MMASavingAccount mm1=new MMASavingAccount(1001,"Arijit",10000.00,true);
		MMASavingAccount mm2=new MMASavingAccount(1003,"Rohit",30000.00,true);
		MMASavingAccount mm3=new MMASavingAccount(1002,"Dutta",40000.00,true);
		MMASavingAccount mm4=new MMASavingAccount(1004,"Rohan",40000.00,true);
		MMASavingAccount mm5=new MMASavingAccount(1005,"Abir",10000.00,true);
				
		HashMap<Employee_Information,MMASavingAccount> hashmap=new HashMap<>();
		hashmap.put(emp1, mm1);
		hashmap.put(emp2, mm2);
		hashmap.put(emp3, mm4);
		hashmap.put(emp4, mm3);
		hashmap.put(emp5, mm5);
		
		
		Set<Entry<Employee_Information,MMASavingAccount>>set=hashmap.entrySet();
		set.stream().forEach((element) -> System.out.println("\n"+element.getValue() + " " +element.getKey()));
	}

}
