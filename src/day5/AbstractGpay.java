package day5;

import java.util.ArrayList;

public abstract class AbstractGpay {

	private static ArrayList<String> Transaction = new ArrayList<String>();
	private String transdetail;

	public abstract void depositAmount(double amount);

	public abstract void widthdrawAmount(double amount);

	public abstract void checkBalance(int pin);
	
	public void recordTransation(String ammount) {
	
		String trnsdetail;
		Transaction.add(transdetail);
	}
	public void ShowHistory() {
		Transaction.forEach(s->System.out.println(s));
		
	
		
	}

	public abstract void makepayment(double amount);

	
		
	}



