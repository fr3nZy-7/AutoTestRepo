package abstraction;

public class ICICI implements RBI{


	@Override
	public void savingAccount() {
		System.out.println("ICICI Savings account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI Current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI Debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI Credit card");
		
	}
	
}
