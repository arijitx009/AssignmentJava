
public class Employee {
	String name;
	String id;
	double salary;
	
	Employee(String name,String id,double salary)	//parameterised constructor
	{
		this.name=name;								//using this keyword to point to the instance member of this class
		this.id=id;
		this.salary=salary;
		
	}
	void display()									//function to display
	{
		System.out.println(" name " +name);
		System.out.println(" id " +id);
		System.out.println(" salary " +salary);
	}	
}
