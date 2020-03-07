package Automobile;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomobileSendQuote extends InitAutomobileTest{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Pricing option leads to Send quote section");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");

		dr.findElement(By.xpath("//button[@id='sendemail']")).click();
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
	public void enterEmailAddr() {

		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("amey_iaf@yahoo.co.in");
	
	}
	
	@Test
	public void enterusername() {

		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("AmeyTest");
	
	}
	
	@Test
	public void enterPassword() {

		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		
		dr.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Password1");
	
	}


}
