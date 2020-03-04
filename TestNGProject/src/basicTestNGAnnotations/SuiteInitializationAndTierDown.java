package basicTestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitializationAndTierDown {
	//its tear down not tier down - inglis longwage
	
	@BeforeSuite
	public void suiteInitialization() {
		
		System.out.println("Start services");
		System.out.println("Delete old logs");
		System.out.println("Deploy applciation");
		System.out.println("Report Initialization");
		
	}
	
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("Report closing");
	}

}
