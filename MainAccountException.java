package Assingment;

import java.util.*;

public class MainAccountException {
	public static void main(String[] args) {

		AccountClassZeorBal ob = new AccountClassZeorBal("Ramesh Prashad", 1, 50);

		Scanner sc = new Scanner(System.in);
		String r;

		do {
			System.out.println("Enter the amount to withdraw: ");
			double amt = sc.nextDouble();

			try {
				amt = ob.withdraw(amt);
			} catch (ZeroBalanceException e) {
				System.out.println(e);
				break;
			}
			System.out.println("Do you wish to continue:(y/n):");
			r = sc.next();

		} while (r.charAt(0) == 'y' || r.charAt(0) == 'Y');

		sc.close();
		System.out.println("program ends here...");
}}
