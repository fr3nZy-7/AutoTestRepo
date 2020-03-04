package TestSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitAndTearDownTestSuite {
	
	@BeforeSuite
	public void suiteInitialization() {
		
		System.out.println("Check environment status");
		System.out.println("Ping website check if its reachable");
		System.out.println("Report Initialization");
		
	}
	
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("Report closing");
		System.out.println("Test suite complete");
	}

}
