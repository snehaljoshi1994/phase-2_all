package oops;

public class Employee {
	
	public String Name;
	public int EmpID;
	private int Salary;
	
public void Display() {
	System.out.println("The name of Employee is " + Name);
	System.out.println("The EmployeeID of Employee is " + EmpID);
	System.out.println("The Salary of Employee is " + Salary);
}

public void SetSalary(int sal) {
	Salary = sal;
	
}
}
