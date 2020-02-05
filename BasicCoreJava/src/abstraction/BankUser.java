package abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		RBI bank = new SBI();
		
		bank.creditCard();
		bank.currentAccount();
		bank.debitCard();
		bank.savingAccount();
		
		
		
		bank = new HDFC();
		
		bank.creditCard();
		bank.currentAccount();
		bank.debitCard();
		bank.savingAccount();
		
		
		
		RBI bank2 = new ICICI();
		
		bank2.creditCard();
		bank2.currentAccount();
		bank2.debitCard();
		bank2.savingAccount();

	}

}
