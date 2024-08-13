package methodOveriding;
class BankAccount
{
	int balance=100000,withdrawal=0;
	void deposite()
	{
		System.out.println("Animal moving..");
	}
	void withdrawal()
	{
		System.out.println("Animal family class invoked..");
	}
}
class SavingAccount extends BankAccount
{
	void deposite()
	{
		int deposite=30000;
		System.out.println("In your SavingAccount deposited amount is: "+deposite);
	}
	void withdrawal()
	{
		int withdrawal=5000;
		System.out.println("In your SavingAccount withdrawal amount is: "+withdrawal);
	}
}
class CheckingAccount extends BankAccount
{
	void deposite()
	{
		super.balance+=30000;
		System.out.println("In your CheckingAccount deposited amount is: "+balance);
	}
	void withdrawal()
	{
		super.withdrawal=100000-5000;
		System.out.println("In your CheckingAccount withdrawal amount is: "+withdrawal);
	}
}
public class BankWithdrawalAndDeposite 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount b = new SavingAccount();
		BankAccount b1 = new CheckingAccount();
		SavingAccount s = (SavingAccount)b;
		s.deposite();
		s.withdrawal();
		CheckingAccount c = (CheckingAccount)b1;
		c.deposite();
		c.withdrawal();
		
	}

}
