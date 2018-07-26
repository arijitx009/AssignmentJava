
public class Sum {
	public static void main(String args[])
	{
		int num=0;   					//initializing num as 0 which represents the summation
		for(int i=0;i<args.length;i++)			//the loop will run from index 0 to lesser than the length of the array
		{
			num+=Integer.parseInt(args[i]);				//the final result
		}
		System.out.println(" the sum is " +num);
	}

}
