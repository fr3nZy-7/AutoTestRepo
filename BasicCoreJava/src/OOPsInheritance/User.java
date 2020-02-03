package OOPsInheritance;

public class User {

	public static void main(String[] args) {
		
		Telephone phn = new Telephone();
		
		phn.calling();
		
		Mobile mob = new Mobile();
		
		mob.calling();
		mob.texting();
		
		Smartphone smphn = new Smartphone();
		
		smphn.calling();
		smphn.texting();
		smphn.internet();

	}

}
