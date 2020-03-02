package SampleAppAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Motorcycle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		//launch browser and navigate to site
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//wait for atleast 5 secs for object to load before throwing exception
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Select motorcycle in main window
		WebElement bike = dr.findElement(By.xpath("//a[@id='nav_motorcycle'][@name='Navigation Motorcycle'][text()='Motorcycle']"));
		bike.click();

		//page 1
		Select sel = new Select(dr.findElement(By.xpath("//select[@id='make']")));
		sel.selectByValue("BMW");
		
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='model']")));
		sel.selectByValue("Motorcycle");
		
		
		WebElement  cc = dr.findElement(By.xpath("//input[@id='cylindercapacity']"));
		cc.sendKeys("1000");
		
		
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
				
		
		if(dr.findElement(By.xpath("//span[@class='counter zero']")).getText() == "0") {
			System.out.println("All fields in page 1 are filled with no validation errors");
		}
				
		WebElement next1 = dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']"));
		next1.click();
		
		//page2
		WebElement firstName = dr.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("Amey");
		
		
		WebElement lastname = dr.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Tambe");
		
		
		WebElement dob = dr.findElement(By.xpath("//input[@id='birthdate']"));
		dob.sendKeys("12/25/1990");
		
		
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
		
		
		dr.findElement(By.xpath("//label[text()=' Speeding']")).click();
		
		
		if(dr.findElement(By.xpath("//span[@class='counter zero']")).getText() == "0") {
			System.out.println("All fields in page 2 are filled with no validation errors");
		}
		
		WebElement next2 = dr.findElement(By.xpath("//button[@id='nextenterproductdata']"));
		next2.click();
		
		//page 3
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/10/2020");
		
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		sel.selectByIndex(1);
		
		
		sel = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		sel.selectByValue("Full Coverage");
		
		
		dr.findElement(By.xpath("//label[text()='Euro Protection']")).click();
		
		
		if(dr.findElement(By.xpath("//span[@class='counter zero']")).getText() == "0") {
			System.out.println("All fields in page 3 are filled with no validation errors");
		}
		
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		
		
		//page 4
		
		//dr.findElement(By.xpath("//table[@id='priceTable']//label[@class='choosePrice ideal-radiocheck-label']//input[@id='selectplatinum']")).click();
		
		dr.findElement(By.xpath("//section[@id='pricePlans']//label[3]//span[1]")).click();
		
		if(dr.findElement(By.xpath("//span[@class='counter zero']")).getText() == "0") {
			System.out.println("All fields in page 4 are filled with no validation errors");
		}
		
		
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
		
		//page 5
		
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("amey_iaf@yahoo.co.in");
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("AmeyTest");
		
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		
		dr.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Password1");
		
		dr.findElement(By.xpath("//button[@id='sendemail']")).click();

	}

}
