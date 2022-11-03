package Assingment;
import java.util.*;

public class ComparatorAccount implements Comparator<MainAccount>{
    
    public int compare(MainAccount ac1, MainAccount ac2)
    {
        System.out.println("Comparing ac1's acctHolderName: " + ac1.getAccountHolderName() + " with ac2's acctHolderName: " + ac2.getAccountHolderName());
        return (int)(ac1.getAccountHolderName().length() - ac2.getAccountHolderName().length());
    }



}