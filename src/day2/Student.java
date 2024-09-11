package day2;

public class Student {
	private int id;
	private String name;
	private String Centre;
	private  String Country;
	 
	
	//no-ags
	Student()	
	{
		
		
	}

	
	public Student(int id, String name, String centre, String country) {
		this.id = id;
		this.name = name;
		this.Centre = centre;
		this.Country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCentre() {
		return Centre;
	}

	public void setCentre(String centre) {
		Centre = centre;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Centre=" + Centre + ", Country=" + Country + "]";
	}

	public void printStudentDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(Centre);
		System.out.println(Country);
	}
	
	

}
