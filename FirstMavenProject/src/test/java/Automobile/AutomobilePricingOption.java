package Automobile;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomobilePricingOption extends InitAutomobileTest{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Product data leads to Pricing options");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");

		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Verify field is editable");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Value is entered in field");
	}

	@Test
	public void selectPricingOption() {

		dr.findElement(By.xpath("//section[@id='pricePlans']//label[3]//span[1]")).click();
	
	}

	
}
