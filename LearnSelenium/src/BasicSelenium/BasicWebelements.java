package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//WebElement automobile = dr.findElement(By.id("nav_automobile")); //by ID
		
		//WebElement automobile = dr.findElement(By.name("Navigation Automobile"));  //by name
		
		//WebElement automobile = dr.findElement(By.linkText("Automobile")); // by LinkText
		
		//WebElement automobile = dr.findElement(By.partialLinkText("tomobile")); // by PartialLinkText
		
		
		// xpath - //a[@id='nav_automobile'][@name='Navigation Automobile'][text()='Automobile']
		//
		
		//WebElement automobile = dr.findElement(By.xpath("//a[@id='nav_automobile'][@name='Navigation Automobile'][text()='Automobile']")); // by xpath
		
//		WebElement automobile = dr.findElement(By.cssSelector("a#nav_automobile")); 
		WebElement automobile = dr.findElement(By.cssSelector("a[name='Navigation Automobile']"));
		
		String s = automobile.getText();
		
		System.out.println(s);
		
		automobile.click();
		
		WebElement txtEngineCap = dr.findElement(By.xpath("//input[@id='engineperformance']"));
		
		txtEngineCap.click();
		txtEngineCap.sendKeys("1000");
		
	}
	
	

}
/* using the following locators we can identify web elements
 *id
 *name
 *classname
 *xpath
 *css selector
 *tagname
 *linktxt
 *partiallinktext 
 * 
 * 
 * 
 * 
 * xpath's basic formula is as follows
 * 
 *    //tagName[@AttrName='AttrValue']
 *    
 *    there are two types of xpath, one is absolute and one is relative. above xpath formaula is of relative type
 *    
 *    absolute xpath will be declared as follows
 *    
 *    /html/body/div/header/div/......a(1)
 *    
 *    relative xpath always starts with double //
 *    
 *    absolute starts with single /
 * 
 *
 * 
 * formula for css selector is as follows
 * 
 * tagName[attrName=attrvalue]
 * 
 * in case of the attribute ID the formula can be used as follows -
 *  its very specific to id other attribute cant be used in the same way to create css selector
 * 
 * tagName#IDValue
 * and use dot for class name instead of # 
 */
