package basicTestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAnnotation {
	
	
	@Test(dataProvider = "getData")
	//dataProvider is a built in function, syntax is dataProvider = function name
	// and the function should have the data provider annotation
	//can be used to run same test using different data sets
	// will run 4 iteration of same test using different set of data 
	public void tes1(String username1, String password1) {
		
		SoftAssert asser = new SoftAssert();
		
		System.out.println("Enter "+ username1+" in username field");
		
		System.out.println("Enter "+ password1+" in password field");
		
		asser.assertEquals(username1, "Username1");
		asser.assertEquals(username1 , "username");
		asser.assertEquals(username1, "amey");
		asser.assertAll();
		
		//Assert.assertEquals(username1, "username1");
		//assert checks if username variable contains username1 value or not
		//this type of assertion is hard assertion, fails test case immediately if the assertion fails
		//the statement below the assert failure will not get executed, but it will run the remainig test cases
		
		
		
	}
	

	
	@DataProvider
	
	public String[][] getData(){
		
		String[][] data = new String[4][2];
		
		//row1
		data[0][0] = "Username1";
		data[0][1] = "Password1";
		
		//row2
		data[1][0] = "Username2";
		data[1][1] = "Password2";
		
		//row3
		data[2][0] = "Username3";
		data[2][1] = "Password3";
		
		//row4
		data[3][0] = "Username4";
		data[3][1] = "Password4";
		
		return data;
	}



}
