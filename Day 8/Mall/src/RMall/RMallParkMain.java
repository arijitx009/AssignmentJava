package RMall;
//Driver program to run the implementation


public class RMallParkMain {
	
	
	public static void main(String args[]) {
		int token;
		
		
		ParkedCarOwnerDetails od1=new ParkedCarOwnerDetails("Arijit","8582993463","Mumbai","MH1223","Honda City");
		ParkedCarOwnerDetails od2=new ParkedCarOwnerDetails("Avik","8552993463","Kolkata","WB6223","Honda Civic");
		ParkedCarOwnerDetails od3=new ParkedCarOwnerDetails("Rohan","7980159112","Delhi","DL1323","Chevrolet Beat");
		ParkedCarOwnerList ol=new ParkedCarOwnerList();
		System.out.println(ol.addnewcar(od1));
		System.out.println(ol.addnewcar(od2));
		System.out.println(ol.addnewcar(od3));
		
		 
		
	
			
		
		
		System.out.println(ol.getParkedCarLocation(165));
		
	ol.RemoveCar(1);
	}

}
