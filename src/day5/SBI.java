package day5;

public class SBI extends AbstractGpay {
	private double balance = 1000;
	private int pin = 2003;

	@Override
	public void depositAmount(double amount) {
		// TODO Auto-generated method stub
		if (amount < balance) {
			balance -= amount;
			String transDetails = "payment of rs." + amount + "made using SBI:";
			recordTransation(transDetails);
		}

	}

	@Override

	// TODO Auto-generated method stub
	public void checkBalance(int pin) {
		if (this.pin == pin) {
			System.out.println("your balance is:" + balance);
		} else {
			System.out.println("invalid pin");
		}
	}
}
