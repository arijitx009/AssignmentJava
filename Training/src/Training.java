import java.util.*;
abstract class Training {
	String id;
	String subject;
	double fees;
	Training()					//Non Parameterised Constructor
	{}
	Training(double fees,String subject,String id)		//Parameterised Constructor
	{
		this.fees=fees;
		this.subject=subject;
		this.id=id;
		
	}
	
	abstract void getOrderValue();				//abstract function

}

