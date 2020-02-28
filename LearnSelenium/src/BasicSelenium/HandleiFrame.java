package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://www.paytm.com");

		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		//iFrame is a window/htmlpage embedded inside a window/htmlpage
		
		Thread.sleep(5000);
		
		//dr.switchTo().frame(0); // since it is the only frame available. we pass the frame id as argument
		
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
		
	}

}
