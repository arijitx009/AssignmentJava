package RMall;

import java.util.ArrayList;
import java.util.List;

public class ParkedCarOwnerList {
	
	private static int tokenNo;  //taking token no into count
	List<ParkedCarOwnerDetails> ownerDetails=new ArrayList<ParkedCarOwnerDetails>(100);

	int addnewcar(ParkedCarOwnerDetails pcod)			//mehod to add it into arraylist
	{
		ownerDetails.add(pcod);
		tokenNo++;
		return tokenNo;
	}
	String getParkedCarLocation(int token)		//function to get the exact location of the car
	{
		String location;
		int section;
		if(token>240 && token<1)
		{
			location="Invalid";
					return location;
		}
		else if(token>=1 && token<=80)
		{
			location="1st floor";
		}
		else if(token>=81 && token<=160)
		{
			token=token-80;
			location="2nd Floor";
			
		}
		else
		{
			token=token-160;
			location="3rd floor";
		}
		section=(int)Math.ceil(token/20.0);
		location= location +   section +  "Section";
				
				return location;
	}
	void RemoveCar(int token)					//function to remove a car
	{
		System.out.println("The cars left after being removed");
		
		ownerDetails.remove(token);
		for(ParkedCarOwnerDetails ownerD:ownerDetails)
		{
		
			
			System.out.println(ownerD.getOwnerName());
			System.out.println(ownerD.getOwnerMobileNo());
			System.out.println(ownerD.getOwnerAddress());
			System.out.println(ownerD.getCarNo());
			System.out.println(ownerD.getCarModel());
			
			
			
		}
	}
	
}
