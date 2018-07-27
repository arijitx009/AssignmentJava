package FactorialException;
//Driver program to run the implementation

public class ExceptionTest {


	public static void main(String args[]) 
	{

		FactorialException1 fe=new FactorialException1();

		try {
			System.out.println(fe.factorial(5));		//try catch block
		}catch(InvalidInputException ie) {
			ie.printStackTrace();
		}
		catch(FactorialException facte)
		{
			facte.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
