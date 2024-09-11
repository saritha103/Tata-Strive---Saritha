package day9;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		for (int j = 1; j <= b; j++) {
			for (int i = 1; i <= a-j+1; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
