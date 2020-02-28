package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleScroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("file:///C:/Users/admin/Downloads/Practice.html");

		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		WebElement ele = dr.findElement(By.xpath("//button[text()='Button to get alert']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		ele.click();
		Thread.sleep(3000);
		Alert a = dr.switchTo().alert();
		
		System.out.println(a.getText());
		
		//a.accept();
		a.dismiss();

	}

}
