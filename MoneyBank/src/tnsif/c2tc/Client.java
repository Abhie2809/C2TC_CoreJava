package tnsif.c2tc;

import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.application.MMSavingAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class Client {
	
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(128,"Abhijeet Jagdale",10000);
		sa.withdraw(2000);
		
		CurrentAcc ca = new MMCurrentAcc(114,"Abhi",14000);
		ca.withdraw(1200);
		
	}

}
