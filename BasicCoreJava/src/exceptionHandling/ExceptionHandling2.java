package exceptionHandling;

import constructor.Car;

public class ExceptionHandling2 {
	
	public static Car car;
	
	public static void main(String[] args) {

		try {
			System.out.println(10 / 2);   // one try block for multiple catch blocks
										 //when line 8 fails, line 10 and 12 will not be executed
			String str = "Amey";		// control will directly go to the relevant catch block of the exception

			System.out.println(str.charAt(2));
			
			car.features();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage()); //avoid adding super class Exception at the very beginning of multiple catch blocks
												//it will get executed everytime as it handles all the exceptions
		}

	}

}
