package Assingment;

public class ZeroBalanceException extends Exception  {
	private double currentBalance;
	private int accNumber;
	public ZeroBalanceException(double currBal, int acctno) {
		super();
		this.currentBalance = currBal;
		this.accNumber = acctno;
	}
	@Override
	public String toString() {
		return "ZeroBalanceAccountException:- [currBal=" + currentBalance + ", acctno=" + accNumber + "]";
	}
}
