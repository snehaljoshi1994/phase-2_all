package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.Name = "Snehal";
		emp1.EmpID = 1;
		emp1.SetSalary(50000);
	
		
		Employee emp2 = new Employee();
		emp2.Name = "Shataxi";
		emp2.EmpID = 2;
		emp2.SetSalary(70000);
		
		emp1.Display();
		emp2.Display();
		
		

	}

}
