package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc {
	
	private boolean isSalary=true;

	public SavingAcc(int AccNo, String AccNm, float AccBal) {
		super(AccNo, AccNm, AccBal);
	}
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
	

}
