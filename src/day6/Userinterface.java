package day6;
import java.util.Scanner;

public class Userinterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter student id:");
		int student = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("enter student name:");
	    int studentname = scanner.nextInt();
		
		System.out.println("enter department name:");
		int department = scanner.nextInt();
		
		System.out.println("enter Gender:");
		int gender = scanner.nextInt();
		
		System.out.println("enter category(hostwller (or) dayscholar:");
		int category = scanner.nextInt();
		
		System.out.println("enter college fee:");
		double college = scanner.nextInt();
		
		if(category.equals("hosteller")) {
			System.out.println("enter the room number");
			String blockname=scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("enter the room type");
			String roomtype=scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("enter the room number");
			String roomnumber=scanner.nextLine();
			scanner.nextLine();
			
			
		}
	}

}
