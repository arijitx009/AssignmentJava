
public class First {
	
	int i;
	int j;
	First()					//non parameterised constructor
	{}
	First(int i)				//parameterised constructor
	{
		this.i=i;
		
	}
	void disp()
	{
		System.out.println("number"+i);
	}

}
class Second extends First {			//second is the child class
	int a;
	
	Second(int i,int a)
	{
		super(i);
		this.a=a;
		
		
	}
	void display()
	{
		super.disp();
		System.out.println("Product is" +(i*a));
	}
	
}

