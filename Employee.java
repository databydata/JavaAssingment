package Assingment;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private double empSalary;
	private int empDeptNo;
	
	//PARAMETARIZED CONSTRUCTOR
	public Employee(int empId, String empName, double empSalary, int empDeptNo) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDeptNo = empDeptNo;
	}
	
/************************************** CONSTRUCTOR OVERLOADING *****************************/
	
	//DEFAULT CONSTRUCTOR
	public Employee()
	{
		/*this.empId = 4;
		this.empName = "Deepu";
		this.empSalary = 32600.200;
		this.empDeptNo = 014;*/
	}
	
	//COPY CONSTRUCTOR
	public Employee(Employee e)
	{
		this.empId = e.empId;
		this.empName = e.empName;
		this.empSalary = e.empSalary;
		this.empDeptNo = e.empDeptNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary > 0)
		{
			this.empSalary = empSalary;
		}
		else
		{
			System.out.println("Enter valid salary!!!");
		}
	}
	public int getEmpDeptNo() {
		return empDeptNo;
	}
	public void setEmpDeptNo(int empDeptNo) {
		this.empDeptNo = empDeptNo;
	}
	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDeptNo="
				+ empDeptNo + "]";
	}

/******************************** FUNCTION OVERLOADING *****************************/
	public double calcSal()
	{
		return this.empSalary *12;
	}
	
	public double calcSal(double bonus)
	{
		return (this.empSalary *12) + bonus;
	}
	
    //e1.equals(e2)
    
    @Override
    public boolean equals(Object obj)  //obj = e2
    {
        return this.empId == ((Employee)obj).empId;
    }
    
    @Override
    public int hashCode()
    {
        //System.out.println("hashCode of this employee with empid:"+this.empId+" is :"+this.empDeptNo);
        return this.empDeptNo;
    }

    
/********************************** we will use this only using comparable interface *************************/    
    @Override
    public int compareTo(Employee e)
    {
    	return this.empId - e.empId;
    }
    
    
    
}
