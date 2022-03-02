package tnsif.c2tc.application;

import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String AccNm, float AccBal) {
		SavingAcc sa = new SavingAcc(AccNo,AccNm,AccBal);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal) {
		CurrentAcc ca = new CurrentAcc(AccNo,AccNm,AccBal);
		return null;
	}

}
