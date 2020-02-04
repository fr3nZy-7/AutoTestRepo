package OOPsInheritance;

public class Mobile extends Telephone{
	
	public void texting() {
		
		System.out.println("Texting from Mobile");
		
	}
	public void calling() {
		System.out.println("Calling from Mobile");
	}
}

//whenever we have two methods with same parameters 
//in parent and child class then those methods are overridden methods
//so in user class when we call the calling fucntion
//the fucntion defined in mobile class will be called