package Assingment;

import java.util.*;

public class MainAccountArrayList {
	public static void main(String args[])
	{
		List<MainAccount> lt = new ArrayList<>();
		
		MainAccount ac1 = new MainAccount("Modi chand", 1201, 2000);
		lt.add(ac1);
		
		MainAccount ac2 = new MainAccount("Yogi chand", 1351, 3810);
		lt.add(ac2);
		
		lt.add(new MainAccount("xing ping Chand", 5431, 2230));
		lt.add(new MainAccount("Putin chnd", 9761, 4495));
		
		System.out.println(lt);
		System.out.println(lt.size());
		
		lt.remove(2);
		System.out.println(lt);
		System.out.println(lt.size());
		
	}
}
