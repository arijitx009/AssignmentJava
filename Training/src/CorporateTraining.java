 class CorporateTraining extends Training{
	 int days;				//Instance variables
	 double getOrderValue;
	 CorporateTraining()
	 {}
	 CorporateTraining(double fees,String subject,String id,int days)  	//parameterised constructor
	 {
		 super(fees,subject,id);
		 this.days=days;
	 }
	 void getOrderValue()			//function to get order value
	 {
		 getOrderValue=fees*days;
	 }
	 void display2()
	 {
		 System.out.println(" The total amount for training is "  +getOrderValue);
	 }

}
