package basicTestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInitializationAndTierDown extends SuiteInitializationAndTierDown{
	//its tear down not tier down - inglis longwage
	@BeforeTest
	public void automoblieTestInitilization() {
		
		System.out.println("Execute Pre conditions of Automobile module");
	}
	
	@AfterTest
	public void automobileTestTearDown() {
		
		System.out.println("Revert back the changes made in Initialization part");
	}

}
