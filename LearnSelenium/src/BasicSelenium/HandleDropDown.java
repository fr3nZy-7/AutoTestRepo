package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		WebElement automobile = dr.findElement(By.cssSelector("a[name='Navigation Automobile']"));
		
		automobile.click();
		
		WebElement make = dr.findElement(By.xpath("//select[@id='make']"));
		
		//make.click();
		//make.sendKeys("BMW");
		
		Select sel = new Select(dr.findElement(By.xpath("//select[@id='make']")));
		
		//sel.selectByIndex(3);
		
		sel.selectByValue("Porsche");
		
		//sel.selectByVisibleText("Honda");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='numberofseats']")));
		
		sel.selectByValue("5");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='fuel']")));
		
		sel.selectByValue("Petrol");
		
		
	}

}
