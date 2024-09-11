package day8;

import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enetr the array size");
			int size = sc.nextInt();

			if (size > 5 || size < 1) {
				System.out.println("invalid array size");
				return;

			}
			int[] array = new int[size];

			System.out.println("enter the number");
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
		}
	}
	 

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;

	}

}
