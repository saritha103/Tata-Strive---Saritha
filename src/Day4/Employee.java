package Day4;

public class Employee {
	private int id;
	private static int nextId=0;
	private String name;
	private double salary;
	
	{
		id = nextId++;
	}
	
	public Employee(String name, double salary) {
		super();
		this.id = nextId;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}

	
	public void displayDetails() {
		System.out.println("ID :"+id+ "\nName :"+name+ "\nSalary :"+salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
