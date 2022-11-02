package Assingment;

public class MainAccount implements Comparable<MainAccount>{
	private String MainAccountHolderName;
	private int MainAccounttNo;
	private double MainAccountbalance;

	public MainAccount(String MainAccountHolderName, int MainAccounttNo, double MainAccountbalance) {
		super();
		this.MainAccountHolderName = MainAccountHolderName;
		this.MainAccounttNo = MainAccounttNo;
		this.MainAccountbalance = MainAccountbalance;
	}

	public String getAccountHolderName() {
		return MainAccountHolderName;
	}

	public void setAccountHolderName(String MainAccountHolderName) {
		this.MainAccountHolderName = MainAccountHolderName;
	}

	public double getBalance() {
		return MainAccountbalance;
	}

	public void setBalance(double MainAccountbalance) {
		this.MainAccountbalance = MainAccountbalance;
	}

	public int getAcctNo() {
		return MainAccounttNo;
	}

	public void deposit(double amt) {
		this.MainAccountbalance = this.MainAccountbalance + amt;
	}

	@Override
	public String toString() {
	        return "[Main Account Holder Name=" + MainAccountHolderName + ", Main Account tNo=" + MainAccounttNo + ", Main Account balance=" + MainAccountbalance + "]";
	}
	
	@Override
	public int compareTo(MainAccount a)
	{
		return this.MainAccounttNo - a.MainAccounttNo;
	}
}
