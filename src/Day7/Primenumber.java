package Day7;

import java.util.Scanner;

public class Primenumber {
	
	    public static void main(String[] args) {
//	        int number = 25;
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the number :");
	        int number =  sc.nextInt();
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    public static boolean isPrime(int num) {
	       
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true; 
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false; 
	        }
	        
	        
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }
	    
	}



