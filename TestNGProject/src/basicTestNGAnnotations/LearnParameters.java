package basicTestNGAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	
	@Test
	@Parameters({"username","password"}) // this should match with our xml file.
	// doest matter what argument name we are giving in the function
	//example @paramters annotation has username, and function has username1 
	public void tes1(String username1, String password1) {
		
		System.out.println("Enter "+ username1+" in username field");
		
		System.out.println("Enter "+ password1+" in password field");
		
	}

}
