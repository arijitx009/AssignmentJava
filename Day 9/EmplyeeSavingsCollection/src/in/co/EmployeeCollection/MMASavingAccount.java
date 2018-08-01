package in.co.EmployeeCollection;

public class MMASavingAccount {
	private int accountID;
	private String accountHolder_Name;
	private double account_Balance;
	private boolean isSalaryAccount;

	public MMASavingAccount(int accountID, String accountHolder_Name, double account_Balance, boolean isSalaryAccount) {
		super();
		this.accountID = accountID;
		this.accountHolder_Name = accountHolder_Name;
		this.account_Balance = account_Balance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getAccountHolder_Name() {
		return accountHolder_Name;
	}

	public double getAccount_Balance() {
		return account_Balance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	@Override
	public String toString() {
		return "MMASavingAccount [accountID=" + accountID + ", accountHolder_Name=" + accountHolder_Name
				+ ", account_Balance=" + account_Balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	


}
