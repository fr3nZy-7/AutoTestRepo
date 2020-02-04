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

//JAVA supports multilevel inheritance but not multiple inheritance.
//to do multiple inheritance in java we need interface




//polymorphism can be achieved by using overloading and overridding
//since overloading is done at compile time it is static polymorphism
//function overriding is dynamic polymorphism
