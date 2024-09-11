package day6;

 public class Hosteller extends Student{
	private int roomnuber;
	private char blockname;
	private String roomtype;
	private int hostelfees;
	
	public Hosteller(int studentId, String studentname, String department, String gender, String category,
			double collegefees, int roomnuber, char blockname, String roomtype) {
		super(studentId, studentname, department, gender, category, collegefees);
		this.roomnuber = roomnuber;
		this.blockname = blockname;
		this.roomtype = roomtype;
	}

	public int getRoomnuber() {
		return roomnuber;
	}

	public void setRoomnuber(int roomnuber) {
		this.roomnuber = roomnuber;
	}

	public char getBlockname() {
		return blockname;
	}

	public void setBlockname(char blockname) {
		this.blockname = blockname;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	
	
	public double calculateTotelfees() {
		double hostelFees=0;
		double roomTypeAmount =0;
		if(blockname == 'A') {
			hostelFees=5000;
			roomTypeAmount=roomtype.equals("Ac")?8000:0;
		}else if(blockname=='B') {
			hostelfees=5000;
			roomTypeAmount=roomtype.equals("non Ac")?5000:0;
		}else if(blockname=='C') {
			hostelFees=4000;
			roomTypeAmount=roomtype.equals("AC")?250:0;
		}
		return collegefees+hostelfees+roomTypeAmount;
		
			
			
 
		
	
	
	}
	
	
	}
	


