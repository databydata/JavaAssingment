package Assingment;

public class AccountClassZeorBal {
	private String MainAccountHolderName;
	private int MainAccounttNo;
	private double MainAccountbalance;

	public AccountClassZeorBal(String MainAccountHolderName, int MainAccounttNo, double MainAccountbalance) {
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
	
	public double withdraw(double amount) throws ZeroBalanceException {
		if(this.MainAccountbalance<=0.0){
        	throw new ZeroBalanceException(this.MainAccountbalance,this.MainAccounttNo);
        }
		else if (amount <= this.MainAccountbalance) {
			this.MainAccountbalance = this.MainAccountbalance - amount;
			System.out.println("Current Balance is " + this.MainAccountbalance + " after withdrawing amt: " + amount);
		}

		return amount;
	}
	
	@Override
	    public String toString() {
	        return "[Main Account Holder Name=" + MainAccountHolderName + ", Main Account tNo=" + MainAccounttNo + ", Main Account balance=" + MainAccountbalance + "]";
	}
}
