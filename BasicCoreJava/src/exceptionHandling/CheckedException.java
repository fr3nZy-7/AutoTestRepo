package exceptionHandling;

import functions.Function1;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException { // we use throws to pass the information of checked exception to the next user
		//throws only work with checked excpeitons it wont work properly with unchecked exceptions, unchecked exception like arithmaticException
		Function1.sum(); // static functions are called using class name
		
		Thread.sleep(5000); //compiler is telling this exception may arise at the time of execution
		
		Function1.sum(); 
		
		

	}

}
