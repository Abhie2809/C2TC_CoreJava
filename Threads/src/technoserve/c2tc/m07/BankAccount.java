package technoserve.c2tc.m07;

public class BankAccount {
	int amount = 1000;
	synchronized void withdraw(int amount) throws InterruptedException
	{
		if(this.amount < amount)
			{
			System.out.println("Less balance go for deposit");
			wait();
			}
		this.amount-=amount;
	}
	synchronized void deposit(int amount) 
	{
		this.amount += amount;
		notify();
	}

}
