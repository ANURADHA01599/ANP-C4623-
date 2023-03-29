package corejava;

 class BankAccount 
{
	private double balance;
	private String accountNumbe;
	//create getter
	public double getBalance() 
	{
		return balance;
	}
	public String getAccountNumbe()
	{
		return accountNumbe;
	}
	// create constructor
	public BankAccount(double balance, String accountNumbe)
	{
		super();
		this.balance = balance;
		this.accountNumbe = accountNumbe;
	}
	// create deposit method
	public void deposit (double amount)
	{
		balance+=amount;
	}
	//withdraw method
	public void withdraw (double amount)
	{
		balance-=amount;
	}
	
	
	
	
}
	
	
	

