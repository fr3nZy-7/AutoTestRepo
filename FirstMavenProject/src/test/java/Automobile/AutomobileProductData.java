package Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomobileProductData extends InitAutomobileTest {
	

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Verify Next button from Insurant data leads to Product data");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Verify no mandatory field is left blank");


		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
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

		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/10/2020");
	
	}
	
	@Test
	public void selectInsuredSum() {

		Select sel = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		sel.selectByIndex(1);
		
	
	}
	
	@Test
	public void selectMeritRating() {

		Select sel = new Select(dr.findElement(By.xpath("//select[@id='meritrating']")));
		sel.selectByValue("Bonus 1");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		sel.selectByValue("Full Coverage");
		
		
		dr.findElement(By.xpath("//label[text()='Euro Protection']")).click();
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='courtesycar']")));
		sel.selectByValue("Yes");
		
	
	}
	
	

}
