package corejava;

public class TestBankAccount
{

	public static void main(String[] args) 
	{ 
		//Create new instance
		BankAccount ba=new BankAccount(1000,"123456");
		System.out.println(ba.getBalance());
		System.out.println(ba.getAccountNumbe());
		//call deposit method with amount 500
		ba.deposit(500);
		//call the withdraw mwthod
		ba.withdraw(200);
		//getbalance
		System.out.println(ba.getBalance());
		
	

	}

}

