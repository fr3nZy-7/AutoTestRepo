package constructor;

public class User {

	public static void main(String[] args) {

		Car ford = new Car();
		ford.colour = "White";
		ford.model = "Figo";
		//ford.wheels = 4;
		ford.features();
		
				
		Car bajaj= new Car();
		bajaj.colour = "Yellow black";
		bajaj.model = "Autorickshaw";  
		Car.wheels = 3; //static variable get called by class name, non static function can be called by class object
		bajaj.features(); // reason for above comment is mentioned below
		
		
		//static variable has one single copy, unlike non static variables
		//for each object(which is an instance of a class) we have copies of all non static variables and methods
		//but when we make a variable or a method as static we have one copy which is accessed by all objects and class instnaces
		//so if a static variable which already has a default value and it gets its value updated by an object 
		//then the next objects that access the static variable will get the updated value.
		
		Car vw = new Car();
		vw.colour = "Green";
		Car.wheels =4;
		vw.model = "Polo GT Tsi";
		//vw.wheels = 4;
		vw.features();
		
		
		Car bmw = new Car("White","Z8");
		bmw.features();
		
	}

}
