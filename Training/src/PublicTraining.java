 class PublicTraining extends Training {
	 int participants;			//Instance members
	 double getOrderValue;
	 PublicTraining()
	 {}
	 PublicTraining(double fees,String subject,String id,int participants )		//Parameterised constructor
	 {
		 super(fees,subject,id);
		 this.participants=participants;

	 }

	@Override
	void getOrderValue()				//Function to get the order value
	
	{
		 getOrderValue=fees*participants;
		
		
	}
	void display()
	{
		System.out.println(" The total amount for training is "  +getOrderValue);
	}
	
}
