package Assingment;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<MainAccount, Double> mp = new HashMap<>();

		MainAccount e1 = new MainAccount("Uday", 25000, 10);

		MainAccount e = new MainAccount("Sanjana", 15000, 10);

		mp.put(new MainAccount("Majnu", 35000, 20), 35000.0);
		mp.put(new MainAccount("Rajeev", 25000, 10), 25000.0);

		System.out.println(
				"contains key Employee Namita with id=13:" + mp.containsKey(new MainAccount("Namita Shah", 35000, 20)));

		System.out.println(
				"contains key,  Employee Sanjana with id=10:" + mp.containsKey(new MainAccount("Sanjana", 15000, 10)));
		System.out.println("contains value, salary value of 15000 rs:" + mp.containsValue(15000.0));

		System.out.println(mp);

		meth(mp);

	}

	static void meth(Map<MainAccount, Double> mp) {

		System.out.println("inside meth method:" + mp.get(new MainAccount("Anubhav Sinha", 15000, 10)));

	}
}
