package Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomobileVehicleData extends InitAutomobileTest{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Automobile hyperlink leads to Automobile section");
		System.out.println("Verify Vehicle data section is opened by default");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");

		WebElement next1 = dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']"));
		next1.click();
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

		Select sel = new Select(dr.findElement(By.xpath("//select[@id='make']")));
		sel.selectByValue("BMW");
	
	}
	
	@Test
	public void enterEnginePerf() {

		WebElement kw = dr.findElement(By.xpath("//input[@id='engineperformance']"));
		kw.sendKeys("320");
	
	}
	
	@Test
	public void enterManufactureDate() {

		WebElement manuDate = dr.findElement(By.xpath("//input[@id='dateofmanufacture']"));
		manuDate.sendKeys("12/25/2019");
	
	}@Test
	public void selectSeats() {

		WebElement seat = dr.findElement(By.xpath("//select[@id='numberofseats']"));
		seat.sendKeys("5");
	
	}
	
	@Test
	public void selectFuelType() {

		Select sel = new Select(dr.findElement(By.xpath("//select[@id='fuel']")));
		sel.selectByValue("Petrol");
	
	}
	
	@Test
	public void enterListPrice() {

		dr.findElement(By.xpath("//input[@id='listprice']")).sendKeys("5000");
	
	}
	
	@Test
	public void enterMileage() {

		WebElement mileage = dr.findElement(By.xpath("//input[@id='annualmileage']"));
		mileage.sendKeys("4000");
	
	}
	
	


}
