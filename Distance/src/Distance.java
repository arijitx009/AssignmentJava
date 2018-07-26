
public class Distance 
{
	int feet;					//Instance members
	float inch;
	Distance()				//non parameterised constructor
	{}
	
		 Distance(int feet,float inch)		//parameterised constructor
		{
			
		this.feet=feet;
		this.inch=inch;
		
		}
		Distance AddDistance(Distance d1,Distance d2)				//function to add distances in feet and inch
		{
			Distance dsum=new Distance();
			dsum.feet=d1.feet+d2.feet;
			dsum.inch=d1.inch+d2.inch;
			 
			if(dsum.inch>=12)
			{
				dsum.feet=(int)( dsum.feet+dsum.inch/12);
						dsum.inch=dsum.inch%12;
				
			}
			return dsum;
				

}

}
