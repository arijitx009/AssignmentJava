package Account;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	
	public static void printSavingsAccount()
	{
	List<SavingsAccount> listOfAccount=new ArrayList<SavingsAccount>();
	//adding elements to savings account objects
	listOfAccount.add(new SavingsAccount(100000.00,101,"Arijit",true));
	listOfAccount.add(new SavingsAccount(200000.00,102,"Avik",true));
	listOfAccount.add(new SavingsAccount(300000.00,103,"Rohit",true));
	listOfAccount.add(new SavingsAccount(300000.00,104,"Ron",false));
	listOfAccount.add(new SavingsAccount(1200000.00,105,"Souvik",true));
	
	System.out.println("The Savings Account are ");
	listOfAccount.stream().forEach((savingsaccount) -> System.out.println("Account Holder Name- " +savingsaccount.getAccountHoldername() + "\nAccount ID- "
	+savingsaccount.getAcc_ID() + "\nAccount Balance- " +savingsaccount.getAcc_balance() + "\nSalary Account- " +savingsaccount.getIsSalaryAccount() + "\n"));
	}
	public static void main(String args[])
	{
	printSavingsAccount();
	}

}
