package Day4;

public class Manager extends Employee {
	String department;

	

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department :"+department);
	}
	

}
