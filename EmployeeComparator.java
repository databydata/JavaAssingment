package Assingment;
import java.util.*;
public class EmployeeComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2)
    {
        System.out.println("Comparing e1's deptno: " + e1.getEmpDeptNo() + " with e2's deptno: " + e2.getEmpDeptNo());
        return (int)(e1.getEmpDeptNo() - e2.getEmpDeptNo());
    }
}
