package basicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsonMethod extends TestInitializationAndTierDown{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Pre conditions for Depends on method class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Post conditions for depends on method class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Pre condition for each every test cases");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Post condition for each and every test case");
	}

	@Test
	public void login() {

		System.out.println("Login");
		//System.out.println(10/0);

	}

	@Test(dependsOnMethods = {"login"})
	public void verifyHomepage() {

		System.out.println("Verify home page");

	}

	@Test(dependsOnMethods = {"login","verifyHomepage"})
	public void logout() {

		System.out.println("Logout");

	}

}
