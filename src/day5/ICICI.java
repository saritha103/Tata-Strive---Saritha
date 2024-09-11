package day5;

public abstract class ICICI extends AbstractGpay {
	private double Balance = 5000;
	private int pin = 1234;

	@Override
	public void depositAmount(double amount) {
		if (amount < Balance) {
			Balance -= amount;
			String transDetails = "payment of rs." + amount + "made using ICICI.";
			recordTransation(transDetails);
		}

	}

	@Override
	public void widthdrawAmount(double amount) {
		// TODO Auto-generated method stub
		if(this.pin==pin) {
			System.out.println("your balance is:");
	}

		else {
			System.out.println("invalid pin");
		}


}
}
