class Time 
{
	int hours;				//instance members
	int minutes;
	Time()
	{}
	
		Time(int hours,int minutes)			//parameterised constructors
		{
			
		this.hours=hours;
		this.minutes=minutes;
		
		}
		Time AddTime(Time t1,Time t2)			//function to calculate the time in hours and minutes
		{
			Time tsum=new Time();
			tsum.hours=t1.hours+t2.hours;
			tsum.minutes=t1.minutes+t2.minutes;
			 
			if(tsum.minutes>=60)
			{
				tsum.hours=( tsum.hours+tsum.minutes/60);
						tsum.minutes=tsum.minutes%60;
				
			}
			return tsum;
				

}

}

