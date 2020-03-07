package Automobile;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestSuite.InitAndTearDownTestSuite;

public class InitAutomobileTest extends InitAndTearDownTestSuite{
	
	@BeforeTest
	public void automoblieTestInitilization() {
		
		dr.findElement(By.xpath("//a[@id='nav_automobile']")).click();
	}
	
	@AfterTest
	public void automobileTestTearDown() {
		
		dr.findElement(By.xpath("//img[@id='tricentis_logo']")).click();
	}

}
