package basicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass extends TestInitializationAndTierDown{
	

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Pre conditions for first test ng class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Post conditions for first test ng class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Pre condition for each every test cases");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Post condition for each and every test case");
	}

	@Test(priority=0)
	public void test4() {
	
		System.out.println("Test case 4");
		
	}
	

	@Test(priority=1)
	public void test2() {
	
		System.out.println("Test case 2");
		
	}
	
	@Test
	public void test3() {
	
		System.out.println("Test case 3");
		
	}
	
	
	@Test
	public void test1() {
	
		System.out.println("Test case 1");
		
	}
	
}
