package Assingment;

import java.util.*;

public class MainAccountTreeSet {

	public static void main(String[] args) {
		
	
		SortedSet<MainAccount> st = new TreeSet<>();

		MainAccount e = new MainAccount("Akhanda", 224, 102);

		st.add(e);
		MainAccount e1 = new MainAccount("Bablu", 226, 102);
		st.add(e1);
		st.add(new MainAccount("Lalit", 223, 103));
		st.add(new MainAccount("Munna", 225, 104));
		st.add(new MainAccount("Guddu", 228, 102));

		System.out.println(st);
		System.out.println(st.size());

		System.out.println(st.contains(e));
		
		//Comparator interface

		System.out.println("Sorting based on employee's dept number...");
		method(new EmployeeComparator());
	}
	
	public static void method(Comparator<Employee> c) {

		SortedSet<Employee> st1 = new TreeSet<Employee>(c);

		Employee e11 = new Employee(2, "Arjun", 2240.76, 102);

		st1.add(e11);

		Employee e1 = new Employee(1, "Suraj", 2900.89, 101);

		st1.add(e1);

		st1.add(new Employee(4, "Sahil", 3512.78, 104));
		st1.add(new Employee(3, "Joshua", 3522.34, 103));

		System.out.println(st1);
	}
}
