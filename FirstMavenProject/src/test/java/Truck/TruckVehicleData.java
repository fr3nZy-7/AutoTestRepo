package Truck;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TruckVehicleData extends InitTruckTest {
	

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Truck hyperlink leads to Truck section");
		System.out.println("Verify Vehicle data section is opened by default");
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
	public void selectMake() {

		System.out.println("Make selected");
	
	}
	
	@Test
	public void enterEnginePerf() {

		System.out.println("Engine performance entered");
	
	}
	
	@Test
	public void enterManufactureDate() {

		System.out.println("Manufacture date entered");
	
	}@Test
	public void selectSeats() {

		System.out.println("Number of seats selected");
	
	}
	
	@Test
	public void selectFuelType() {

		System.out.println("Fuel type  selected");
	
	}
	
	@Test
	public void enterListPrice() {

		System.out.println("List price entered");
	
	}
	
	@Test
	public void enterMileage() {

		System.out.println("Mileage entered");
	
	}
	
	



}
