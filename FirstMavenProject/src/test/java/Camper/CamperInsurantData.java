package Camper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CamperInsurantData extends InitCamperTest{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Vehicle data leads to Insurant data");
		
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
	public void enterFirstLastName() {

		System.out.println("First and last name is entered");
	
	}
	
	@Test
	public void enterDob() {

		System.out.println("Date of birth entered");
	
	}

	@Test
	public void selectGender() {

		System.out.println("Gender entered");
	
	}


}
