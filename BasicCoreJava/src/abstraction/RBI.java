package abstraction;

public interface RBI extends Modiji, SupremeCourt{
	// multiple inheritance in thihs case as they are interfaces
	public void savingAccount();
	public void currentAccount();
	public void debitCard();
	public void creditCard();
	

}
