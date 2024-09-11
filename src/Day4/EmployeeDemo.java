package Day4;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp = new Manager("Suvaraj", 50000, "HR");
		emp.displayDetails();

		emp = new Developer("Randy", 70000, "Java");
		emp.displayDetails();
	}

}
