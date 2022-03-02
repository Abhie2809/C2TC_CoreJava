package tnsif.c2tc.application;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int AccNo, String AccNm, float AccBal) {
		super(AccNo, AccNm, AccBal);
	}

	@Override
	public void withdraw(float AccBal) {
		if(AccBal < creditLimit)
			System.out.println("You do not have the sufficient amount of Credit balance to perform this operation.");
		else
			System.out.println("You have withdrawn successfully. Account balance is : "+AccBal+
					"Minimum required balance is : "+creditLimit);
	}

}
