package exceptionHandling;
import constructor.Car;

public class ExceptionType1 {
	
	public static Car car; //since it is globally declared compiler will not throw error/warnings
	// public static Car car = new Car();
	public static void main(String[] args) {
		
		System.out.println(10/2);
		
		//Exception 1 - ArithmeticException
		
		//System.out.println(10/0);
		
		//Exception 2 - StringIndexOutOfBoundsException
		String name = "Amey";
		
		//System.out.println(name.charAt(4));
		
		
		//Exception 3 - NullPointerException
		// when a reference of a class is not initialized and the reference is used then we get a null pointer exception
		car.features();
		
		
		//Two types of exceptions - Checked and Unchecked
		//Checked exception are checked by compiler
		//Unchecked exception are shown at run time as it is not checked by compiler
		
		

	}

}
