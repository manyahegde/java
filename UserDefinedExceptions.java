class NotSufficientFundException extends Exception 
{
	public NotSufficientFundException(String message) 
	{
		super(message);
	}
}

class Account 
{
	private int balance = 1000;
	public int balance() 
	{
		return balance;
	}
	public void withdraw(int amount) throws NotSufficientFundException 
	{
		if (amount > balance) 
		{
			throw new NotSufficientFundException(String.format("Exception while withdrawing! Current balance %d is less than requested amount %d", balance, amount));
		}
		balance = balance - amount;
	}
	public void deposit(int amount) 
	{
		if (amount <= 0) 
		{
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount));
		}
	}
}

public class UserDefinedExceptions 
{
	public static void main(String args[]) 
	{
		Account acct = new Account();
		System.out.println("Current balance : " + acct.balance());
		System.out.println("Withdrawing $200");
		try {
			acct.withdraw(200);
		}
		catch(NotSufficientFundException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Current balance : " + acct.balance());
		try
		{
			acct.withdraw(1000);
		}
		catch(NotSufficientFundException e)
		{	
			System.out.println(e.getMessage());
		}
		System.out.println("Current balance : " + acct.balance());
		try
		{
			acct.deposit(-200);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
