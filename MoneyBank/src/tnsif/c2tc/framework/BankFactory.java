package tnsif.c2tc.framework;

public interface BankFactory {
	
	public SavingAcc getNewSavingAcc(int AccNo, String AccNm, float AccBal);
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal);

}
