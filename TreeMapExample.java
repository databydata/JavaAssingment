package Assingment;

import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {



	       SortedMap<MainAccount, Double> smp = new TreeMap<>();



	       MainAccount a1 = new MainAccount("Uday Shetty", 25000, 10);



	       smp.put(a1, a1.getBalance());



	       MainAccount a = new MainAccount("Sanjana Shetty", 15000, 30);



	       smp.put(a, a.getBalance());



	       smp.put(new MainAccount("Majnu", 35000, 20), 35000.0);




	        System.out.println(smp);



	       System.out.println("Sorting MainAccount keys....");
	        func(new ComparatorAccount());
	    }
	    



	   public static void func(Comparator<MainAccount> c) {
	        TreeMap<MainAccount, Double> smp = new TreeMap<>(c);



	       MainAccount a11 = new MainAccount("Rajeev Singhania", 25000, 10);



	       smp.put(a11, a11.getBalance());



	       MainAccount aa = new MainAccount("Rahul Singh", 15000, 30);



	       smp.put(aa, aa.getBalance());



	       smp.put(new MainAccount("Sangeeta Shah", 35000, 20), 35000.0);
	        smp.put(new MainAccount("Raj Malhotra", 25000, 10), 25000.0);



	       System.out.println(smp);



	   }
}
