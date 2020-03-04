package Motorcycle;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MotorcycleSendQuote extends InitMotorcycleTest{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Pricing option leads to Send quote section");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");
		System.out.println("Click next button");
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

		System.out.println("Email address entered");
	
	}
	
	@Test
	public void enterusername() {

		System.out.println("username entered");
	
	}
	
	@Test
	public void enterPassword() {

		System.out.println("password entered");
	
	}



}
