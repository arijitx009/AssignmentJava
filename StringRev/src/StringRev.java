import java.util.Scanner;

class StringRev {
	//Driver program to run the implementation
	public static void main (String args[])
	{
		String str ;						//Instance members 
		String rev="";
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		str=sc.nextLine();
		int l=str.length()-1;				
		while(l>=0)
		{
			ch=str.charAt(l);
			rev=rev+ch;
			l--;
		}
		System.out.println("The reverse String is" +rev);
		}

}
