import java.util.Scanner;
public class StringSearch 
{
	public static void main(String args[])
	{
		int i=0,flag=0;			//Instance members
		String search;
		String str[]= {"Abhirup","Arijit","Kaka","Ronaldo","Messi","Dhoni","Virat"};		//Creating an array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to search");
		search=sc.next();
		for(i=0;i<str.length;i++)				//loop will run from index 0 to the length of the array and search for the string
		{
			if(str[i].equals(search))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("String found at position"  +(i+1));
		}
		else {
			System.out.println("Not Found");
		}
}
}
