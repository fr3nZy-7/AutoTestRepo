package Truck;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestSuite.InitAndTearDownTestSuite;

public class InitTruckTest extends InitAndTearDownTestSuite{
	

	@BeforeTest
	public void truckTestInitilization() {
		
		System.out.println("Verify availability of Truck hyperlink");
		System.out.println("Truck hyperlink is clicked");
	}
	
	@AfterTest
	public void truckTestTearDown() {
		
		System.out.println("Navigate back to home page");
	}

}
