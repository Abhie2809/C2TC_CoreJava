package tnsif.c2tc.application;

import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int AccNo, String AccNm, float AccBal) {
		super(AccNo, AccNm, AccBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float AccBal) {
		System.out.println("You have withdrawn from balance : "+AccBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + "]";
	}

}
