package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartScenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://www.flipkart.com");
		
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// this is implicit wait, it gets tagged with the driver dr object
		//it gets applied to all the driver elements
		// it will wait for 2 seconds for elements to load
		// it will throw exception if element is not found after waiting for 2 secs
		// it will stop waiting if element is found before wait time is over
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act = new Actions(dr);
		
		WebElement ele = dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][text()='Men']"));
		
		act.moveToElement(ele).build().perform();
		
		
		//Thread.sleep(200);
		
		ele = dr.findElement(By.xpath("//a[@title='Shirts'][text()='Shirts']"));
		
		ele.click();
		
		ele=dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		
		act.dragAndDropBy(ele, 100, 0).build().perform();
		
		Thread.sleep(2000);
		ele=dr.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']/div[@class='_3aQU3C']"));
		
		act.dragAndDropBy(ele, -100, 0).build().perform();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		String parent = dr.getWindowHandle();
		Set<String> wins = dr.getWindowHandles();
		
		for(String w:wins) {
			if(!w.equals(parent)) {
				dr.switchTo().window(w);
			}
		}
		
		System.out.println(dr.findElements(By.xpath("//div[@class='edKlv2'][text()='Available offers']")).size());
		
		dr.close();
		dr.switchTo().window(parent);
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	}

}
