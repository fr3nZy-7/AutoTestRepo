package Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomobileInsurantData extends InitAutomobileTest{
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Vehicle data leads to Insurant data");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");

		WebElement next2 = dr.findElement(By.xpath("//button[@id='nextenterproductdata']"));
		next2.click();
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

		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Amey");
		
		
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Tambe");
	
	}
	
	@Test
	public void enterDob() {

		dr.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("12/25/1990");
	
	}

	@Test
	public void selectGender() {

		dr.findElement(By.xpath("//label[text()='Male']")).click();
		
		dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Lohegaon Pune");
		
		
		Select sel = new Select(dr.findElement(By.xpath("//select[@id='country']")));
		sel.selectByValue("India");
		
		
		WebElement pincode = dr.findElement(By.xpath("//input[@id='zipcode']"));
		pincode.sendKeys("411014");
		
		
		WebElement city = dr.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Pune");
		
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		sel.selectByValue("Farmer");
		
		
		dr.findElement(By.xpath("//label[text()=' Speeding']")).click();
		
		
	
	}
}
