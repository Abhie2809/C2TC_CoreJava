package tnsif.c2tc.framework;

public class BankAcc {
	
	private int AccNo;
	private String AccNm;
	private float AccBal;
	
	
	public BankAcc(int AccNo, String AccNm, float AccBal) {
		super();
		this.AccNo = AccNo;
		this.AccNm = AccNm;
		this.AccBal = AccBal;
	}
	
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int AccNo) {
		this.AccNo = AccNo;
	}
	public String getAccNm() {
		return AccNm;
	}
	public void setAccNm(String AccNm) {
		this.AccNm = AccNm;
	}
	public float getAccBal() {
		return AccBal;
	}
	public void setAccBal(float AccBal) {
		this.AccBal = AccBal;
	}
	
	
	
	public void withdraw(float AccBal)
	{
		
	}
	public void deposit(float AccBal)
	{
		
	}
	@Override
	public String toString() {
		return "BankAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal="
				+ AccBal + "]";
	}

}
