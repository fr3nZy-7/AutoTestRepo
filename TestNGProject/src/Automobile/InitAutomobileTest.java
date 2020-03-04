package Automobile;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestSuite.InitAndTearDownTestSuite;

public class InitAutomobileTest extends InitAndTearDownTestSuite{
	
	@BeforeTest
	public void automoblieTestInitilization() {
		
		System.out.println("Verify availability of Automobile hyperlink");
		System.out.println("Automobile hyperlink is clicked");
	}
	
	@AfterTest
	public void automobileTestTearDown() {
		
		System.out.println("Navigate back to home page");
	}

}
