package day6;

public class Dayscholer extends Student {

	private double busnumber;
	private double distance;

	public Dayscholer(int studentId, String studentname, String department, String gender, String category,
			double collegefees, double distance, double busnumber) {
		super(studentId, studentname, department, gender, category, collegefees);
		this.busnumber = busnumber;
		this.distance = distance;

		// TODO Auto-generated constructor stub
	}

	public double getBusnumber() {
		return busnumber;
	}

	public void setBusnumber(double busnumber) {
		this.busnumber = busnumber;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public double calculateTotelfees() {
		double totelFees = getCollegefees();

		if (distance > 30 && distance <= 40) {
			totelFees += 28000;
		} else if (distance > 20 && distance <= 30) {
			totelFees += 20000;
		} else if (distance > 10 && distance <= 20) {
			totelFees += 12000;

		} else if (distance <= 10) {
			totelFees += 6000;

		}
		return totelFees;

	}

}
