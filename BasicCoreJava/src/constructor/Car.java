package constructor;

public class Car {
	
	String colour;
	String model;
	static int wheels=4;
	
	
	public void features() {
		System.out.println("Congratualtions on your new "+wheels+" wheeler, a "+colour+" car named "+model);
	}
	
	
	public Car() {
		
		//every class has a constructor, its default constructor is with the same name
		//Costructor are used to initialise an object of a class
		//Constructor doesnt have a return type
	}

}
