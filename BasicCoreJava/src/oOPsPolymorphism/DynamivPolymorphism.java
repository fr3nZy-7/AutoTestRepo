package oOPsPolymorphism;

import OOPsInheritance.*;

public class DynamivPolymorphism {

	public static void main(String[] args) {
		
		Telephone phone = new Mobile();
		phone.calling();
		// reference of telephone but object of Mobile
		// this is dynamic polymorphism
		// reference of parent class is assigned object of child class
		// the parent class reference can only call its own function 
		// and fucntions that are overridden in its child classes
		// calling of overridden fucntions is resolved at run time rather than compile time
		
		
		
		phone = new Telephone();
		phone.calling();
		
		
		
		phone = new Smartphone();
		phone.calling();

	}

}
