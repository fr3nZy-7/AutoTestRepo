package Motorcycle;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestSuite.InitAndTearDownTestSuite;

public class InitMotorcycleTest extends InitAndTearDownTestSuite{
	

	@BeforeTest
	public void motorcycleTestInitilization() {
		
		System.out.println("Verify availability of Motorcycle hyperlink");
		System.out.println("Motorcycle hyperlink is clicked");
	}
	
	@AfterTest
	public void motorcycleTestTearDown() {
		
		System.out.println("Navigate back to home page");
	}

}
