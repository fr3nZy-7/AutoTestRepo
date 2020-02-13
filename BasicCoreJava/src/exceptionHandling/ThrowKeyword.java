package exceptionHandling;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) {
		//temp();   //-> can be handled using throws declaration at main function or surrounding temp() with try catch 
		
		
		//we use throw key word to intentionally throw an exception
		throw new ArithmeticException();
		
		
		//some times used in selenium to skip a test case
		//throw new SkipException(); used using test ng
	}
	public static void temp() throws InterruptedException, IOException{
		
	}
}
