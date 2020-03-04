package Truck;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TruckProductData extends InitTruckTest{
	

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Insurant data leads to Product data");
		
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
	public void selectStartDate() {

		System.out.println("Start date is entered");
	
	}
	
	@Test
	public void selectInsuredSum() {

		System.out.println("Insured sum is entered");
	
	}
	
	@Test
	public void selectMeritRating() {

		System.out.println("Merit rating is entered");
	
	}
	
	


}
