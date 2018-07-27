package FactorialException;

 class FactorialException1 {


	
		 long factorial(int num) throws InvalidInputException,FactorialException			//customised exception
		 {
			 long fact=1;			//initializing the value of fact
			 if(num<2)				//if else block todetermine whether the exception sustains 
			 {
				 throw new InvalidInputException("Number cannot be less than two");
			 }
			 else
			 {
				 while(num>0)			
				 {
					 fact=num*fact;		//to calculate the factorial
					 num--;
				 }
				 if(fact > 214783647)
					 throw new FactorialException("out of range");
			 }
			 return fact;
		 }
			


			 
			 
			 
			 
			 
		 }