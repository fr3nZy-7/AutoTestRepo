package Camper;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestSuite.InitAndTearDownTestSuite;

public class InitCamperTest extends InitAndTearDownTestSuite{
	

	@BeforeTest
	public void camperTestInitilization() {
		
		System.out.println("Verify availability of Camper hyperlink");
		System.out.println("Camper hyperlink is clicked");
	}
	
	@AfterTest
	public void camperTestTearDown() {
		
		System.out.println("Navigate back to home page");
	}

}
