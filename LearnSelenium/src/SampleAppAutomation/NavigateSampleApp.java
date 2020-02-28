package SampleAppAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateSampleApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		
		WebElement bike = dr.findElement(By.xpath("//a[@id='nav_motorcycle'][@name='Navigation Motorcycle'][text()='Motorcycle']"));
		
		bike.click();
		
		//dr.findElement(By.xpath("//a[@id='nav_motorcycle'][@name='Navigation Motorcycle'][text()='Motorcycle']")).click(); //can be used as this too. prevent writing excess lines
		
		Select sel = new Select(dr.findElement(By.xpath("//select[@id='make']")));
		sel.selectByValue("BMW");
		
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='model']")));
		sel.selectByValue("Motorcycle");
		
		
		
		WebElement  cc = dr.findElement(By.xpath("//input[@id='cylindercapacity']"));
		
		cc.sendKeys("1000");
		
	//	dr.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("1000");
		
		WebElement kw = dr.findElement(By.xpath("//input[@id='engineperformance']"));
		
		kw.sendKeys("120");
		
		WebElement manuDate = dr.findElement(By.xpath("//input[@id='dateofmanufacture']"));
		
		manuDate.sendKeys("12/25/2019");
		
		WebElement seat = dr.findElement(By.xpath("//select[@id='numberofseatsmotorcycle']"));
		
		seat.sendKeys("2");
		
		WebElement price = dr.findElement(By.xpath("//input[@id='listprice']"));
		
		price.sendKeys("5000");
		
		WebElement mileage = dr.findElement(By.xpath("//input[@id='annualmileage']"));
		
		mileage.sendKeys("4000");
				
		WebElement next1 = dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']"));
				
		next1.click();
		
		WebElement firstName = dr.findElement(By.xpath("//input[@id='firstname']"));
		
		firstName.sendKeys("Amey");
		
		WebElement lastname = dr.findElement(By.xpath("//input[@id='lastname']"));
		
		lastname.sendKeys("Tambe");
		
		WebElement dob = dr.findElement(By.xpath("//input[@id='birthdate']"));
		
		dob.sendKeys("12/25/1990");
		
	//	WebElement male = dr.findElement(By.xpath("//input[@id='gendermale']"));
		
	//	male.click();  / this code was not working
				
		dr.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement address = dr.findElement(By.xpath("//input[@id='streetaddress']"));
		
		address.sendKeys("Lohegaon Pune");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='country']")));
		
		sel.selectByValue("India");
		
		WebElement pincode = dr.findElement(By.xpath("//input[@id='zipcode']"));
		
		pincode.sendKeys("411014");
		
		WebElement city = dr.findElement(By.xpath("//input[@id='city']"));
		
		city.sendKeys("Pune");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		
		sel.selectByValue("Farmer");
		
	//	WebElement hobby = dr.findElement(By.xpath("//input[@id='speeding']"));
		
	//	hobby.click();  // this code was not working
		
		dr.findElement(By.xpath("//label[text()=' Speeding']")).click();
		
		WebElement next2 = dr.findElement(By.xpath("//button[@id='nextenterproductdata']"));
		
		next2.click();
		
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/10/2020");
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		
		sel.selectByIndex(1);
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		
		sel.selectByValue("Full Coverage");
		
		dr.findElement(By.xpath("//label[text()=' Speeding']")).click();
		
		//dr.findElement(By.xpath("//label[text()='Euro Protection']")).click();
		
		//dr.findElement(By.xpath("//input[@id='EuroProtection']")).click();
		
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		
		
		
		
		
		
		
		

	}

}
