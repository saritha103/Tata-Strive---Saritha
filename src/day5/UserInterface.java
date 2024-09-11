package day5;

import java.util.Scanner;

public class UserInterface {
	private static final int case1 = 0;

	public static void main(String[]args) {
		ICICI icici=new ICICI();
		SBI sbi=new SBI();
		AbstractGpay AbstarctGpay =icici;
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("user interface\n--------------");
			System.out.println("1.make payment");
			System.out.println("2.check balance");
			System.out.println("3.see history");
			System.out.println("4.switch account0");
			System.out.println("5.exit");
			ch==sc.nextInt();
			switch(ch) {
			case1:
				System.out.println("enter the amount");
			double amount=sc.nextDouble();
			AbstractGpay.makepayment(amount);
			break;
			case2:
				System.out.println("enter the pin");
			int pin=sc.nextInt();
			AbstarctGpay.checkBalance(pin);
			break;
			case3:
				System.out.println("select the account \n1.ICICI\n2.SBI");
			int ch2=sc.nextInt();
			if(ch==1) {
				AbstractGpay=icici;
				System.out.println("gpay is switched to SBI bank account");
			}
			break;
			case5:
				System.out.println("thank you for using gpay");
			break;
			default:
				System.out.println("invalid option");
				
			}
			
			}while(ch!=5);
		}
	}


