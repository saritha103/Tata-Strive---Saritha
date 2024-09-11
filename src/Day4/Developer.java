package Day4;

public class Developer extends Employee {
		

		String programming_Language;
		
		public Developer(String name, double salary, String programming_Language) {
			super(name, salary);
			this.programming_Language = programming_Language;
		}

		public Developer(String name, double salary) {
			super(name, salary);
		}
		public void displayDetails() {
			super.displayDetails();
			System.out.println("Programming Language:"+programming_Language);
		}
}
