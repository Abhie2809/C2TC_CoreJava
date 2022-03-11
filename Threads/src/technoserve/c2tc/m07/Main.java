package technoserve.c2tc.m07;

public class Main {

	public static void main(String[] args) throws Exception {
		BankAccount ba = new BankAccount();
		Thread t1 = new Thread(()->
		         { 
		        	 try {
						ba.withdraw(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		         });
		Thread t2 = new Thread(()->
		         {
		        	 ba.deposit(500); 
		         });
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(ba.amount);
				
	}

}
