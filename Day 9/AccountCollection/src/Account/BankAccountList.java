package Account;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	
	public static void main(String args[])
	{
	Set<SavingsAccount> nameSet=new TreeSet<SavingsAccount>();
	//adding objects of class Savings Account
	nameSet.add(new SavingsAccount(600000.00,103,"Arijjit",true));
	nameSet.add(new SavingsAccount(300000.00,104,"Avik",false));
	nameSet.add(new SavingsAccount(1500000.00,105,"Ron",true));
	nameSet.add(new SavingsAccount(190000.00,101,"Rohit",true));
	nameSet.add(new SavingsAccount(200000.00,102,"Souvik",true));
	nameSet.add(new SavingsAccount(300000.00,103,"Bitan",true));

	System.out.println("The Savings Account are ");
	nameSet.stream().forEach((savingsaccount) -> System.out.println("Account Holder Name- " +savingsaccount.getAccountHoldername() + "\nAccount ID- "
	+savingsaccount.getAcc_ID() + "\nAccount Balance- " +savingsaccount.getAcc_balance() + "\nSalary Account- " +savingsaccount.getIsSalaryAccount() + "\n"));
	}

}
