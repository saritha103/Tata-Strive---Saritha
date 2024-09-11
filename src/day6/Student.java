package day6;

public abstract class Student {
	protected int StudentId;
	protected String Studentname;
	protected String department;
	protected String gender;
	protected String category;
	protected double collegefees;
	public Student(int studentId, String studentname, String department, String gender, String category,
			double collegefees) {
		super();
		StudentId = studentId;
		Studentname = studentname;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegefees = collegefees;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCollegefees() {
		return collegefees;
	}
	public void setCollegefees(double collegefees) {
		this.collegefees = collegefees;
	}
	
	
public abstract double calculateTotelfees();
	
	

}
