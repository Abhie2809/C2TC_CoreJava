package tnsif.c2tc.framework;

public class CurrentAcc extends BankAcc {
	
protected final float creditLimit = 1000;
	
	public CurrentAcc(int AccNo, String AccNm, float AccBal) {
		super(AccNo, AccNm, AccBal);
	}

}
